package ss5_access_modifier_static_method_static_property_java.exc.bai_tap_xay_dung_lop_chi_ghi;

public class StudentsList {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        std1.setName("VTran");
        std1.setClasses("C08");
        System.out.println(std2.toString());
        System.out.println(std1.toString());

        //note da tu so sanh khi co static va khong co static
    }
}
