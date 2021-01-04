import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double score1;
    private double score2;
    private double score3;
    private double score4;
    public boolean diem1 = true;
    public boolean diem2 = true;
    public boolean diem3 = true;
    public boolean diem4 = true;
    public double dtb;


    public Student(int id,String name, int age, String gender, double score1, double score2, double score3, double score4,double dtb) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.dtb = dtb;
    }

    public Student(int id ,String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public double getDtb() {
        return (getScore1() + getScore2() + getScore3() + getScore4())/4;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getScore4() {
        return score4;
    }

    public void setScore4(double score4) {
        this.score4 = score4;
    }

    @Override
    public String toString() {
        return "Student: " +
                " id = " + id +
                " name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", score1 = " + score1 +
                ", score2 = " + score2 +
                ", score3 = " + score3 +
                ", score4 = " + score4 +
                ", ĐTB :  " + dtb;
    }
}
