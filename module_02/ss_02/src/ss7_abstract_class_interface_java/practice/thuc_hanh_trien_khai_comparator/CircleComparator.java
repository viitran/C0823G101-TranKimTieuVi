package ss7_abstract_class_interface_java.practice.thuc_hanh_trien_khai_comparator;

import ss6_inheritance_java.practice.thuc_hanh_sup_va_sub.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

