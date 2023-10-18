package ss7_abstract_class_interface_java.practice.method_abstrac;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}
