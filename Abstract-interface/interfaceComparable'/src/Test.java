import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];

        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle(3.7);
        comparableCircles[2] = new ComparableCircle(3.5);

        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }

        System.out.println("");


        Arrays.sort(comparableCircles);
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }

    }



}
