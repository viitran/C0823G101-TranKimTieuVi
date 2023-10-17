package ss6_inheritance_java.practice.thuc_hanh_Sup_va_Sub;

public class Circle extends Geometric {
    private double radius;

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
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

    public double getDiameter() {
        return radius * 2;
    }


    public void printCircle() {
        System.out.println("The circle has " + radius + "color: " + getColor() + "\n Area = " + getArea() + "\n Perimeter = "
                + getPerimeter() + "\n Diameter = " + getDiameter());
    }

}
