package ss7_abstract_class_interface_java.exc.bai_tap_trien_khai_interface_resizeable;

public class TesterInterfaceResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        circle.resize(70);
        System.out.println(circle.getArea());
        Square square = new Square(10);
        System.out.println(square.getArea());
        square.resize(70);
        System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea());
        rectangle.resize(70);
        System.out.println(rectangle.getArea());
    }
}
