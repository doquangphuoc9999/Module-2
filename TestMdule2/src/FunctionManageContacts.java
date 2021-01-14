import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionManageContacts {
    CheckValidate checkValidate = new CheckValidate();
    Scanner scanner = new Scanner(System.in);
    static ArrayList<ManageContacts> arrayList = new ArrayList<>();
//    static int id = 1;
    private static final String fileName = "data\\contacts.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
//    private static final String FILE_HEADER = "id, tên, tuổi, giới tính, số điện thoại, địa chỉ, gmail, facebook";

    static {
        new File("data/").mkdirs();
    }

    public void menu() {
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi từ file");
        System.out.println("8. Thoát");

        int option = checkValidate.checkNumber("Chọn chức năng: ");

        switch (option) {
            case 1:
                seeList();
                break;
            case 2:
                add();
                break;
            case 3:
                update();
                break;
            case 4:
                remove();
                break;
            case 5:
                search();
                break;
            case 6:
                readFile();
                break;
            case 7:
                writeFile();
                break;
            case 8:
                System.exit(0);
                break;
        }

    }

//  Xem danh sách học bạ

    public void seeList() {
        if (arrayList.size() == 0) {
            System.out.println("Danh sách trống");
        }
        ManageContacts manageContacts1 = new ManageContacts();
        manageContacts1.printTilte();
        for (ManageContacts manageContacts : arrayList) {
            manageContacts.printContact();
        }
    }

//  Thêm mới

    public void add() {
        System.out.println("----Thêm mới----");
        String name = checkValidate.checkName("Nhập họ và tên: ");
        System.out.println("Nhập ngày tháng năm sinh của bạn");
        String dateOfBird = checkValidate.checkDateOfBird("XX-XX-XXXX: ");
        String gender = checkValidate.gender("Nhập giới tính: ");
        String phoneNumber = checkValidate.checkPhoneNumber("Nhập số điện thoại: ");
        String address = checkValidate.checkAddress("Nhập địa chỉ: ");
        System.out.println("Nhập gmail của bạn");
        String gmail = checkValidate.checkgmail("ví dụ: name@gmail.com: ");
        System.out.print("Nhập tên facebook: ");
        String faceBook = scanner.nextLine();

        ManageContacts manageContacts = new ManageContacts( name, dateOfBird, gender, phoneNumber, address, gmail, faceBook);
        arrayList.add(manageContacts);
    }


//   tìm số điện thoại

    public ManageContacts findPhone(String phone) {
        for (ManageContacts manageContacts : arrayList) {
            if (manageContacts.getPhoneNumber().contains(phone)) {
                return manageContacts;
            }
        }
        return null;
    }

//  Cập nhật

    public void update() {
        System.out.println("Cập nhật");
        try {
            String phone = checkValidate.checkPhoneNumber("Nhập số điện thoại bạn muốn cập nhật: ");
            ManageContacts findId = findPhone(phone);

            if (findId == null) {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
                int replay = checkValidate.checkNumber("Nhấn 1 để quay lại nhập số điện thoại hoặc nhấn số bất kì để quay lại menu");

                if (replay == 1) {
                    update();
                } else {
                    menu();
                }
            } else {
                System.out.println("1. Sửa tên");
                System.out.println("2. Sửa tuổi");
                System.out.println("3. Sửa giới tính");
                System.out.println("4. sửa số điện thoại");
                System.out.println("5. sửa địa chỉ");
                System.out.println("6. sửa gmail");
                System.out.println("7. sửa facebook");
                int option = checkValidate.checkNumber("Chọn chức năng: ");

                if (option == 1) {
                    String name = checkValidate.checkName("Nhập tên bạn muốn cập nhật: ");
                    findId.setName(name);
                } else if (option == 2) {
                    String dateOfBird = checkValidate.checkDateOfBird("Nhập ngày tháng năm sinh bạn muốn cập nhật: ");
                    findId.setAge(dateOfBird);
                } else if (option == 3) {
                    String gender = checkValidate.gender("Nhập giới tính bạn muốn cập nhật: ");
                    findId.setGender(gender);
                } else if (option == 4) {
                    String phoneNumber = checkValidate.checkPhoneNumber("Nhập số điện thoại bạn muốn cập nhật: ");
                    findId.setPhoneNumber(phoneNumber);
                } else if (option == 5) {
                    String address = checkValidate.checkAddress("Nhập địa chỉ bạn muốn cập nhật: ");
                    findId.setAddress(address);
                } else if (option == 6) {
                    String gmail = checkValidate.checkgmail("Nhập gmail bạn muốn cập nhật: ");
                    findId.setEmail(gmail);
                } else if (option == 7) {
                    System.out.println("Nhập tên facebook bạn muốn cập nhật: ");
                    String facebook = scanner.nextLine();

                    findId.setFaceBook(facebook);
                } else {
                    int replay = checkValidate.checkNumber("Lựa chọn của bạn không hợp lê. Nhấn 1 để trở lại hàm nhấn số bất kì để trở lại menu");
                    if (replay == 1) {
                        update();
                    } else {
                        menu();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//  xóa

    public void remove() {
        System.out.println("Xóa danh bạ");
        try {
            String findPhone = checkValidate.checkPhoneNumber("Nhập số điện thoại bạn muốn xóa");

            ManageContacts idRemove = findPhone(findPhone);

            if (idRemove == null) {
                int replay = checkValidate.checkNumber("Không tìm được danh bạ với số điện thoại trên. Nhấn 1 để quay lại hàm hoặc nhấn số bất kì để trở lại menu");
                if (replay == 1) {
                    remove();
                } else {
                    menu();
                }
            } else {
                int replay = checkValidate.checkNumber("Bạn có chắc chắn muốn xóa danh bạ này. Nhấn 1 để xóa, hoặc nhấn số bất kì để trở lại menu");
                if (replay == 1) {
                    arrayList.remove(idRemove);
                }
            }


        } catch (Exception e) {
            menu();
        }
    }


//  tìm kiếm

    public void search() {
        System.out.println("Tìm kiếm");
        try {
            String id = checkValidate.checkPhoneNumber("Nhập số điện thoại bạn muốn tìm: ");

            ManageContacts findId = findPhone(id);

            if (findId == null) {
                int replay = checkValidate.checkNumber("Id của bạn hiện không có trong danh sách. Nhấn 1 để quay lại hàm, nhấn số bất kì để trở lại menu: ");
                if (replay == 1) {
                    search();
                } else {
                    menu();
                }
            } else {
                findId.printTilte();
                findId.printContact();
            }

        } catch (Exception e) {
            menu();
        }
    }

//   đọc từ file

    public ArrayList<ManageContacts> readFile() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                arrayList.add(parsingCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                System.out.println("Đọc file thành công");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            return arrayList;
    }

    public ManageContacts parsingCsvLine(String message) {
        String[] data = new String[7];
        if (message != null) {
            String[] split = message.split(COMMA_DELIMITER);
            for (int i = 0; i < split.length; i++) {
                data[i] = split[i];
            }
        }
        return new ManageContacts(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
    }


//  ghi từ file

    public void writeFile() {
        {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(fileName);
                for (ManageContacts contact : arrayList) {
                    fileWriter.append(contact.getName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getAge());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getGender());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getPhoneNumber());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getAddress());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getEmail());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(contact.getFaceBook());
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
                System.out.println("Ghi file thành công");
            } catch (Exception e) {
                System.err.println("Lỗi ghi file");
            } finally {
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("Lỗi ghi file trong quá trình đóng/flush file");
                    e.printStackTrace();
                }
            }
        }

    }
}
