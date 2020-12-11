import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Phuoc", 19,"Hue");
        Student student1 = new Student("Giang",18,"Hue");
        Student student2 = new Student("Thao",17,"Hue");

        List<Student> studentList = new ArrayList<>();

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        Collections.sort(studentList);
        for (Student st : studentList){
            System.out.println(st.toString());
        }

        System.out.println("xếp tuổi nhỏ nhất");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList,ageComparator);

        for (Student student3 : studentList){
            System.out.println(student3.toString());
        }
    }
}
