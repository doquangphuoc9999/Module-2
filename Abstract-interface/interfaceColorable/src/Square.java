public class Square implements Colorable{
    private int a;


    public Square(int a) {
        this.a = a;
    }

    public Square() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getAea(){
        return a*a;
    }

    public double getPerimeter(){
        return 4*a;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square " +
                " a = " + a ;
    }
}
