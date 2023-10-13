package ss5_access_modifier_static_method_static_property_java.practice.thuc_hanh_static_property;

public class Cars {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Cars(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Cars.numberOfCars = numberOfCars;
    }
}
