package ss6_inheritance_java.exc.bai_tap_point_va_moveablepoint;

public class Tester {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 2, 3, 4);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
