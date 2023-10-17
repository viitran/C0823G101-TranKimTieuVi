package ss6_inheritance_java.practice.thuc_hanh_Sup_va_Sub;

public class Geometric {
    private String color;
    private String filled;

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public Geometric() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled == null) {
            return "created with " + color + " color and no fill";
        }
        return "created with " + color + " color and filled with " + filled + " color";
    }
}
