package ss6_inheritance_java.exc.bai_tap_thiet_ke_va_trien_khai_triangle;

public class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (getColor() == null) {
            return " A shape has no color";
        }
        return " A shape has color: " + getColor();
    }
}

