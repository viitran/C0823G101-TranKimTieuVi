package ss4_class_oob_java.exc.bai_tap_fan;

public class TheFan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    String color = "blue";
    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public TheFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TheFan() {
    }

    public String toString() {
        if (this.on) {
            return "speed: " + getSpeed() + ", radius: " + getRadius() + ", color: " + getColor() + ", status: fan is on";
        } else {
            return " radius: " + getRadius() + ", color: " + getColor() + ", status: fan is off";
        }
    }
}
