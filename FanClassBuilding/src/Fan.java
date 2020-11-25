public class Fan {
   static final int slow = 1;
   static final int medium = 2;
   static final int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +

                    " speed = " + speed +
                    ", Fan is on " +
                    ", radius = " + radius +
                    ", color = " + color + '\'' +
                    '}';
        }
        return "Fan{" +

                " Fan is off " +
                ", radius = " + radius +
                ", color = " + color + '\'' +
                '}';
    }

}

