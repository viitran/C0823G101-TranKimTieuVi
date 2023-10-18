package ss7_abstract_class_interface_java.exc.bai_tap_trien_khai_interface_colorable;

public class Tester {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(4);
        squares[1] = new Square(5);
        for (Square square : squares) {
            System.out.println(square.getArea());
            if (square instanceof Colorable) {
                System.out.println(((Colorable) square).howtoColor());
            }
        }
    }
}
