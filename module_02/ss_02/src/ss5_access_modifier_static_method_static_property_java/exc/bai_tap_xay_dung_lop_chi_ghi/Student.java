package ss5_access_modifier_static_method_static_property_java.exc.bai_tap_xay_dung_lop_chi_ghi;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student " +
                "name: " + name +
                ", classes: " + classes;
    }
}
