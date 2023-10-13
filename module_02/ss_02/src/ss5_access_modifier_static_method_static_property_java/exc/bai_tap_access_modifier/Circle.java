package ss5_access_modifier_static_method_static_property_java.exc.bai_tap_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", radius = " + getRadius() +
                ", area = " + getArea();
    }
}