public class Circle implements Colorable{

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius*radius;
    }

    public double getPerimeter(){
        return Math.PI * 2*radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius = " + radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all inbound circle");
    }

    public static void main(String[] args) {
         double sum = 0;
         Circle circle = new Circle();
         Circle[] cirleS = new Circle[5];

         cirleS[0] = new Circle(3);
         cirleS[1] = new Circle(2);
         cirleS[2] = new Circle(4);
         cirleS[3] = new Circle(6);
         cirleS[4] = new Circle(5);

         for (int i = 0; i < cirleS.length;i++){
             sum += cirleS[i].getArea();
         }
             System.out.println(sum);
    }
}
