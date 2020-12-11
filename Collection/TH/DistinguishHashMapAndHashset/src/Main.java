import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Phuoc",19,"Hue");
        Student student1 = new Student("Giang",19,"Hue");
        Student student2 = new Student("Thảo", 17,"Hue");

        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1,student);
        map.put(2,student1);
        map.put(3,student2);

        for(Map.Entry<Integer, Student> Student : map.entrySet()){
            System.out.println(Student.toString());
        }

        System.out.println("---------------------Set---------------------");

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        for (Student duyet : students){
            System.out.println(duyet.toString());
        }

    }
}
