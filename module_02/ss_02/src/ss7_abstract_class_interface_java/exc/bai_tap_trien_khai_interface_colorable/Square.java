package ss7_abstract_class_interface_java.exc.bai_tap_trien_khai_interface_colorable;

import ss7_abstract_class_interface_java.exc.bai_tap_trien_khai_interface_resizeable.*;

public class Square extends Rectangle implements Colorable {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String howtoColor() {
        return "Color all four sides";
    }
}
