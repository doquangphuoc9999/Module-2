public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getArea(){
        return height*Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Height = " + height +
                super.toString()
                ;
    }
}
