package ss6_inheritance_java.exc.bai_tap_Circle_va_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //the tich
    public double getVolume() {
        return (Math.PI * Math.pow(getRadius(), 2) * height);
    }

    @Override
    public String toString() {
        return super.toString() + ", height = " + getHeight() + "\n Volume = " + getVolume();
    }

}
