package ss6_inheritance_java.practice.thuc_hanh_Sup_va_Sub;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("Red");
        circle.setFilled("Black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.setColor("White");
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        System.out.println();
    }
}
