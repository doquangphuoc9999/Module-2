import java.util.Scanner;

class Rectangle {

    double width;
    double height;

    public Rectangle(){};

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getAre(){
        return width * height;
    }

    public  double getPerimeter(){
        return  (width+height)*2;
    }

    public void display(){
        System.out.println("Width: " + width + "Height: " + height );

    }

    public static void main(String[] args) {
        Rectangle chunhat = new Rectangle(5,6);

        System.out.println("Area: " + chunhat.getAre());

        System.out.println("Perimeter: "+chunhat.getPerimeter());
    }
}