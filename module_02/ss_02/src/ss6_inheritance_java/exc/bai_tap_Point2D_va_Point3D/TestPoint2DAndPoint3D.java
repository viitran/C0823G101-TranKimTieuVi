package ss6_inheritance_java.exc.bai_tap_Point2D_va_Point3D;

public class TestPoint2DAndPoint3D {
    public static void main(String[] args) {
        Point3D pointDefault = new Point3D();
        Point3D point1 = new Point3D(4, 5, 6);
        System.out.println(pointDefault.toString());
        System.out.println(point1.toString());
    }
}
