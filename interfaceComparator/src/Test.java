import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];

        circle[0] = new Circle(3.5);
        circle[1] = new Circle(5.7);
        circle[2] = new Circle(1);

// for(kdl tenbien : tên  mang);
        for (Circle circle1 : circle){
            System.out.println(circle1);
        }
        Comparator circleComparator = new CircleComparator();

        System.out.println("Sau khi sắp xếp: ");
//        Arrays.sort(circle, circleComparator);
        Arrays.sort(circle,circleComparator);

        for (Circle circle1 : circle){
            System.out.println(circle1);
        }


    }
}
