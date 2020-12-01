public class Cylinder {
    public static double getVolume(double radius, double height){
       double baseArea = getBaseArea(radius);
       double getBasePerimeter = getBasePerimeter(radius);
       double volume = getBasePerimeter * height + 2 * baseArea;
       return volume;
    }

    private static double getBaseArea(double radius) {
        return Math.PI * radius*radius;
    }

    private static double getBasePerimeter(double radius){
        return Math.PI * 2 * radius;
    }


}
