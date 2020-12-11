public class Student {
    private String name;
    private int Age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        Age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student " +
                "name = " + name +
                ", Age = " + Age +
                ", address = " + address;
    }
}
