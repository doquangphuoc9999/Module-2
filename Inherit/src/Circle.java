public class Circle extends Shape{
    double radius = 1;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius +
                " which is a subclass of " + super.toString() ;
    }
}
