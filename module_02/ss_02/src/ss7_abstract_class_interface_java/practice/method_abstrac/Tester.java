package ss7_abstract_class_interface_java.practice.method_abstrac;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(3,4,5);
        circle.draw();
        circle.moveTo( 5,6);
        circle.erase();
    }
}
