import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionStudent {
    Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> arrayList;
    Student student;
    public static int id = 1;

    static  {
        try (
                FileInputStream fileInputStream = new FileInputStream("Student.TxT");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
                ){
            if (fileInputStream == null){
                arrayList = new ArrayList<>();
            }
            else {
                arrayList = (ArrayList<Student>) objectInputStream.readObject();
            }

            int max = 0;
            for (Student student1 : arrayList){
                int id = student1.getId();
                if (student1.getId() > max){
                    max = id;
                }
            }
            id = max + 1;

        } catch (Exception e) {
            arrayList = new ArrayList<>();
        }
    }
    public void menu(){
        System.out.println("---------------Welcome--------------");
        System.out.println("----------------Menu---------------");
        System.out.println("========================================");
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xoá học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa nhập điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("8. exit");
        System.out.println("=========================================");
        int option = checkValidate("Nhập lựa chọn của bạn");

        switch (option){
            case 1:
                seenListStudent();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                removeStudent();
                break;
            case 5:
                inputScore();
                break;
            case 6:
                editScore();
                break;
            case 7:
                dtb();
            case 8:
                System.exit(0);
                break;
        }
                writeFile();

    }

//  xem danh sasch hocj vien
    public void seenListStudent(){
        for (Student student : arrayList){
            System.out.println(student);
        }
    }


//  tìm sinh vien bang id
    public Student findId(int id){
        for (Student student : arrayList){
            if (id == student.getId()){
                return student;
            }
        }
        return null;
    }



//  thêm học viên
    public void addStudent(){
        System.out.println("Thêm học viên");
        System.out.print("Nhập tên học vien: ");
        String name = scanner.nextLine();
        int age = checkValidate("Nhập tuổi học viên: ");
        String genger = checkGender("Nhập giới tính của học viên");

        student = new Student(id++,name,age,genger);
        arrayList.add(student);

        writeFile();

    }

// sửa thông tin học viên

    public void editStudent(){
        System.out.println("Hàm sửa thông tin học viên");
        System.out.println("============================");
        try {
            int id = checkValidate("Nhập id học viên: ");
            Student student = findId(id);

            if (student == null){
                System.out.println("Không tìm thấy id bạn cần tìm.");
                int replay = checkValidate("Nhấn 1 để nhập lại tên id, nhấn nút bất kì để trở lại menu: ");

                if (replay == 1){
                    editStudent();
                }
                else {
                    menu();
                }
            }
        else {
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                int age = checkValidate("Nhập tuổi: ");
                String gender = checkGender("Nhập giới tính: ");

                student.setName(name);
                student.setAge(age);
                student.setGender(gender);

                writeFile();
            }

        } catch (Exception e) {
            menu();
        }

    }

//  xóa học vien bang id

    public void removeStudent(){
        System.out.println("Hàm xóa học viên");
        System.out.println("=======================");
        try {
            int id = checkValidate("Nhập id bạn muốn xóa: ");
            Student student = findId(id);

            if (student == null){
                int replay = checkValidate("Nhấn 1 để nhập lại id, nhấn số bất kì để trở lại menu");
                if (replay == 1){
                    removeStudent();
                }
                else {
                    menu();
                }
            }
            else {
                System.out.println("Bạn có chắc chắn muốn xóa học viên này");
                int option = checkValidate("Nhấn 1 để xóa nhấn số bất kì để trở lại menu");

                if (option == 1){
                    arrayList.remove(student);
                }
                else {
                    menu();
                }
            }
            writeFile();
        } catch (Exception e) {
            menu();
        }
    }

//   hàm nhập điểm

    public void inputScore(){

        System.out.println("hàm nhập điểm: ");
        int id = checkValidate("Nhập id bạn muốn nhập: ");
        Student checkScore = findId(id);
            if (checkScore == null){
                System.out.println("id bạn nhập k hợp lệ");
                int option = checkValidate("Nhấn 1 để nhập lại id nhấn số bất kì để trở về menu");

                if (option == 1){
                    inputScore();
                }
                else {
                    menu();
                }
            }

            else {
                try {
                    int score = checkValidate("Nhập hệ số bạn muốn nhập: ");

                    if (score == 1 && checkScore.diem1 == true){
                        double diem = checkValidate("Nhập điểm của bạn: ");

                        checkScore.setScore1(diem);
                        writeFile();
                        checkScore.diem1 = false;
                    }

                    else if (score == 2 && checkScore.diem2 == true){
                        double diem = checkValidate("Nhập điểm của bạn");

                        checkScore.setScore2(diem);
                        writeFile();
                        checkScore.diem2 = false;
                    }
                    else if (score == 3 && checkScore.diem3 == true){
                        double diem = checkValidate("Nhập điểm của bạn");

                        checkScore.setScore2(diem);
                        writeFile();
                        checkScore.diem3 = false;
                    }
                    else if (score == 4 && checkScore.diem4 == true){
                        double diem = checkValidate("Nhập điểm của bạn");

                        checkScore.setScore2(diem);
                        writeFile();
                        checkScore.diem4 = false;
                    }
                } catch (Exception e) {
                    int replay = checkValidate("Hệ số k hợp lệ nhấn 1 để trở lại hàm nhập nhấn số bất kì để trở lại menu");
                    if (replay == 1){
                        inputScore();
                    }
                    else {
                        menu();
                    }
                }
            }
        }

//   sửa điểm

    public void editScore(){
        System.out.println("Hàm sửa điểm");
        int id = checkValidate("Nhập id bạn muốn sửa: ");
        Student student = findId(id);

        if (student == null){
            int replay = checkValidate("id bạn vừa nhập k hợp lệ. Nhấn 1 để trở lại sửa điểm nhấn nút bất kì để trở lại menu");
            if (replay == 1){
                editScore();
            }
            else {
                menu();
            }
        }
        else {
            int enterScore = checkValidate("Nhập hệ số bạn muốn sửa: ");
            if (enterScore == 1){
                int score1 = checkValidate("Nhập điểm của bạn: ");
                student.setScore1(score1);
                writeFile();
            }
            else if (enterScore == 2){
                int score2 = checkValidate("Nhập điểm của bạn: ");
                student.setScore2(score2);
                writeFile();
            }
            else if (enterScore == 3){
                int score3 = checkValidate("Nhập điểm của bạn: ");
                student.setScore3(score3);
                writeFile();
            }
            else if (enterScore == 4){
                int score4 = checkValidate("Nhập điểm của bạn: ");
                student.setScore4(score4);
                writeFile();
            }
        }
    }

//  tính điểm trung bình

    public void dtb(){
        System.out.println("Hàm tính điểm trung bình");
        int id = checkValidate("Nhập id bạn muốn tính");

        Student student = findId(id);

        if(student == null){
            int replay = checkValidate("id bạn không hợp lệ, nhấn 1 để trở lại hàm nhấn số bất kì để trở lại menu");
            if (replay == 1){
                dtb();
            }
            else {
                menu();
            }
        }
        else {
            if (student.getDtb() >= 8 && student.getDtb() <= 10){
                System.out.println("Điểm trung bình là: " + student.getDtb() + " xếp học lực giỏi");
                menu();
            }
            else if (student.getDtb() >= 7){
                System.out.println("Điểm trung bình là: " + student.getDtb() + " Xếp học lực khá");
                menu();
            }
            else if (student.getDtb() >= 5){
                System.out.println("Điểm trung bình là: " + student.getDtb() + " Xếp học lực trung bình");
                menu();
            }
            else if (student.getDtb() >= 0){
                System.out.println("Điểm trung bình là: " + student.getDtb() + " Xếp học lực yếu");
                menu();
            }
            else {
                int diem = checkValidate("Điểm của bạn nhập k hợp lệ, nhấn 1 để trở lại hàm nhấn số bất kì để trở lại menu");
                if (diem == 1){
                    dtb();
                }
                else {
                    menu();
                }
            }

        }
    }

//  ghi file

    public void writeFile(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Student.TxT");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            objectOutputStream.writeObject(arrayList);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//  Ktra đầu vào phải nhập là male hoặc famale

    public static String checkGender(String mess) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mess);
        System.out.println("Male or Female");
        String gender = scanner.nextLine().replace(" ","");
        String fomatGender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        if (fomatGender.equals("Male") || fomatGender.equals("Female")) {
            return fomatGender;
        } else {
            return checkGender(mess);
        }
    }


//  check đầu vào là số

    public int checkValidate(String message){
        System.out.println(message);

        try {
            int number = Integer.parseInt(scanner.nextLine().trim());
            if (number <= 0){
                System.out.println("Chương trình k nhận số âm");
                checkValidate(message);
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("Không phải là một số");
            return checkValidate(message);
        }
    }
}
