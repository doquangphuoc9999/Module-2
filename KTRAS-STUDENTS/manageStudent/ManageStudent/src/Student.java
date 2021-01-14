import java.util.Comparator;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String age;
    private String gender;
    private double score1 = -1;
    private double score2= -1;
    private double score3= -1;
    private double score4= -1;
    private double medium= -1;
    public boolean enterScore1 = false;
    public boolean enterScore2 = false;
    public boolean enterScore3 = false;
    public boolean enterScore4 = false;


    public Student() {
    }

    public Student(int id,String name, String  age, String gender, double score1, double score2, double score3, double score4, double medium) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score1 = score1;
        this.gender = gender;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.medium = medium;
    }

    public Student(int id,String name, String age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public double getMedium() {
        return medium;
    }

    public void setMedium() {
        int count = 0;
        int total = 0;

        if (this.getScore1() != -1){
            total += this.getScore1();
            count += 1;
        }
        if (this.getScore2() != -1){
            total += this.getScore2();
            count += 1;
        }
        if (this.getScore3() != -1){
            total += this.getScore3()*2;
            count += 2;
        }
        if (this.getScore4() != -1){
            total += this.getScore4()*3;
            count +=3;
        }
        this.medium = total/count;
    }

    public void printStudent() {
        System.out.format("%-5s | ", this.getId());
        System.out.format("%-60s | " , this.getName());
        System.out.format("%-15s | " , this.getAge());
        System.out.format("%-10s | " , this.getGender());
        System.out.format(this.getScore1() != -1 ? "%-10.1f | ":"%-10s | " , this.getScore1() != -1 ? this.getScore1() : "");
        System.out.format(this.getScore2() != -1 ? "%-10.1f | ":"%-10s | " , this.getScore2() != -1 ? this.getScore2() : "");
        System.out.format(this.getScore3() != -1 ? "%-10.1f | ":"%-10s | " , this.getScore3() != -1 ? this.getScore3() : "");
        System.out.format(this.getScore4() != -1 ? "%-10.1f | ":"%-10s | " , this.getScore4() != -1 ? this.getScore4() : "");
        System.out.format(this.getMedium() != -1 ? "%20.1f | ":"%-20s | " , this.getMedium() != -1 ? this.getMedium() : "");
        System.out.println();
        System.out.println("-----+---------------------------------------------------------------+-----------------+------------+------------+------------+------------+------------+----------------------+");
    }

    public void printTilte(){
        System.out.println("-----+---------------------------------------------------------------+-----------------+------------+------------+------------+------------+------------+----------------------+");
        System.out.format("%-5s | ", "ID");
        System.out.format("%-60s | ", "Name");
        System.out.format("%-15s | ", "AGE");
        System.out.format("%-10s | ", "GENDER");
        System.out.format("%-10s | ", "SCOURE1");
        System.out.format("%-10s | ", "SCOURE2");
        System.out.format("%-10s | ", "SCOURE3");
        System.out.format("%-10s | ", "SCOURE4");
        System.out.format("%-20s | ", "MEDIUM SCOURE");
        System.out.println();
        System.out.println("-----+---------------------------------------------------------------+-----------------+------------+------------+------------+------------+------------+----------------------+");
    }



}
