package ss4_class_oob_java.practice;

public class Rectangle {
    double width;
    double height;
    double area;
    double perimeter;
    String display;

    public double getArea() {
        return this.width * this.height;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return (this.width * this.height) * 2;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getDisplay() {
        return "HCN co " + "chieu rong = " + width + " chieu dai = " + height;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
