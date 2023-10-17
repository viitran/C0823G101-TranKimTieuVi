package ss5_access_modifier_static_method_static_property_java.practice.thuc_hanh_static_property;

public class BuildCars {
    public static void main(String[] args) {
        Cars car1 = new Cars("Mazda 3", "Skyactiv 3");
        System.out.println(Cars.numberOfCars);
        Cars car2 = new Cars("Mazda 6", "Skyactiv 6");
        System.out.println(Cars.numberOfCars);
    }
}
