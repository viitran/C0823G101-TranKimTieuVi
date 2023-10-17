package ss6_inheritance_java.practice.thuc_hanh_He_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "Green";
    private boolean filled = true;
    Shape(){}

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (isFilled()) {
            return "A shape with color of " + getColor() + " and filled";
        }
        return "A shape with color of " + getColor() + " and not filled! ";
    }
}
