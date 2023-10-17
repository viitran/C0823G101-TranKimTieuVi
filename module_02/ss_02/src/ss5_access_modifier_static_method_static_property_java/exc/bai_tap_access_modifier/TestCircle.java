package ss5_access_modifier_static_method_static_property_java.exc.bai_tap_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        //neu su dung public + default thi truy cap duoc cac phuong thuc cua no
        System.out.println("Circle has radius = " + circle.getRadius() + " and area = " + circle.getArea());

        //note - neu chuyen AM line 15 + 19 thanh private thi su dung line so 9 khong thi su dung trong chinh class cua no
//        System.out.println(circle.toString());
    }
}
