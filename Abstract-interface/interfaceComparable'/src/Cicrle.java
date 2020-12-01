public class Cicrle {
    private double radius;

    public Cicrle(double radius) {
        this.radius = radius;
    }

    public Cicrle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cicrle " +
                " radius = " + radius ;
    }
}
