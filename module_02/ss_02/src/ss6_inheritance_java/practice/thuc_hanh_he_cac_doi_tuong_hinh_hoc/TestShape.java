package ss6_inheritance_java.practice.thuc_hanh_he_cac_doi_tuong_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape("white", true);
        System.out.println(s.toString());
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println(c.toString());
        Rectangle r = new Rectangle();
        System.out.println(r.toString());
        Square sq = new Square(5);
        System.out.println(sq.toString());
    }
}
