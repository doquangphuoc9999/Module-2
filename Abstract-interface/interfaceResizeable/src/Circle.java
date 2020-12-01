public class Circle implements Resizeable{
    private double radius;

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
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius = " + radius ;
    }

    @Override
    public void resize(){
        radius = Math.floor(Math.random()*100)+1;
    }


}
