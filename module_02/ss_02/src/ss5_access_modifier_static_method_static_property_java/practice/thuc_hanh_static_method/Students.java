package ss5_access_modifier_static_method_static_property_java.practice.thuc_hanh_static_method;

public class Students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Students(int r, String n) {
        this.rollno = r;
        this.name = n;
    }

    static void changed() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println("stt: " + rollno + " name: "  +  name + " college: " + college);
    }
}
