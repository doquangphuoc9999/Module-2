public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width* height;
    }

    public double getPerimeter(){
        return (width + height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() +
                " and " + "length = " + getHeight() +
                ",which is a subclass of" + super.toString();
    }
}
