package ss5_access_modifier_static_method_static_property_java.practice.thuc_hanh_static_method;

public class BuildStudent {
    public static void main(String[] args) {
        Students.changed();
        Students std1 = new Students(1, "vi");
        Students std2 = new Students(2, "Vtran");
        std1.display();
        std2.display();
    }
}
