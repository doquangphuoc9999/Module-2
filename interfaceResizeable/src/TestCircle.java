public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());

        circle.resize();
        System.out.println(circle);
    }
}
