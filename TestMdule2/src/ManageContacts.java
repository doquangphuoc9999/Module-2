public class ManageContacts {
//    private int id;
    private String name;
    private String age;
    private String gender;
    private String phoneNumber;
    private String address;
    private String email;
    private String faceBook;

    public ManageContacts() {
    }

    public ManageContacts( String name, String age, String gender, String phoneNumber, String address, String email, String faceBook) {
//        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.faceBook = faceBook;
    }




    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(String faceBook) {
        this.faceBook = faceBook;
    }

    public void printContact() {
        System.out.format("%-25s | ", this.getName());
        System.out.format("%-10s | " , this.getAge());
        System.out.format("%-10s | " , this.getGender());
        System.out.format("%-11s | " , this.getPhoneNumber());
        System.out.format("%-11s | " , this.getAddress());
        System.out.format("%-28s | " , this.getEmail());
        System.out.format("%-10s | " , this.getFaceBook());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    }

    public void printTilte(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-25s | ", "Tên");
        System.out.format("%-10s | ", "Ngày sinh");
        System.out.format("%-5s | ", "Giới tính");
        System.out.format("%-10s | ", "Số điện thoại");
        System.out.format("%-10s | ", "Địa chỉ ");
        System.out.format("%-28s | ", "Gmail");
        System.out.format("%-10s | ", "FaceBook");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    }
}
