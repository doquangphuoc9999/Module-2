public class Employee {
  private String name;
  private int id;
  private int age;
  private String address;
  private int phoneNumber;
  private String gender;

    public Employee(String name, int id, int age, String address, int phoneNumber, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
