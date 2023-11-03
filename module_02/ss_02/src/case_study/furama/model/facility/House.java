package case_study.furama.model.facility;

public class House extends Facility{
    private String standard;
    private String floor;

    public House(String serviceCode, String serviceName, String usableArea, String expense, String people, String rentalType, String standard, String floor) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
        this.standard = standard;
        this.floor = floor;
    }

    public House(String serviceCode, String serviceName, String usableArea, String expense, String people, String rentalType) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House has standard: " + standard + ", floor='" + floor;
    }
}
