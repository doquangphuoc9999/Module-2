public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "width = " + width +
                ", height=" + height ;
    }

    @Override
    public void resize(){
        width = Math.floor(Math.random()*100)+ 1;
    }
}
