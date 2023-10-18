package ss7_abstract_class_interface_java.practice.thuc_hanh_interface_comparable_cho_cac_lop_hh;

import ss6_inheritance_java.practice.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle  implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
