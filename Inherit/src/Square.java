public class Square extends Shape{
    double side;


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
        super();
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        return "Side = " + side +
                ", color='" + color + '\'' +
                ", filled=" + filled;
    }
}
