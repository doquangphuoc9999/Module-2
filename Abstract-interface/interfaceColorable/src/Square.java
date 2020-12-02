public class Square implements Colorable{
    private int size;


    public Square(int size) {
        this.size = size;
    }

    public Square() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getAea(){
        return size * size;
    }

    public double getPerimeter(){
        return 4* size;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square " +
                " a = " + size;
    }
}
