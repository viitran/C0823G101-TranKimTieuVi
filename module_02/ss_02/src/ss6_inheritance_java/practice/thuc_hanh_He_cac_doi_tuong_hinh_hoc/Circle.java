package ss6_inheritance_java.practice.thuc_hanh_He_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    Circle() {

    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return (2 * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius +", which is a subclass of " + super.toString();
    }
}
