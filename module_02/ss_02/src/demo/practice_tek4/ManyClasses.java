package demo.practice_tek4;

public class ManyClasses {
    public static class Polygon{
        public void display(){
            System.out.println("A Polygon is created");
        }
    }
    public static class Rectangle extends Polygon{

    }
    public static class Triangle extends Polygon{

    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Triangle b = new Triangle();
        a.display();
        b.display();
    }
}
