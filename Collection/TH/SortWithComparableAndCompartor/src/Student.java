public class Student implements Comparable<Student>{
    private String name;
    private int Age;
    private String Address;

    public Student(String name, int age, String address) {
        this.name = name;
        Age = age;
        Address = address;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student " +
                "name = " + name+
                ", Age = " + Age +
                ", Address = " + Address ;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
