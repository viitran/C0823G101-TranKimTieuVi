package case_study.furama.model.facility;

public class Villa extends Facility{
    private String stander;
    private String SwimmingPoolArea;
    private String floor;

    public Villa(String serviceCode, String serviceName, String usableArea, String expense, String people,
                 String rentalType, String stander, String swimmingPoolArea, String floor) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
        this.stander = stander;
        SwimmingPoolArea = swimmingPoolArea;
        this.floor = floor;
    }

    public Villa(String serviceCode, String serviceName, String usableArea, String expense, String people, String rentalType) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
    }

    public String getStander() {
        return stander;
    }

    public void setStander(String stander) {
        this.stander = stander;
    }

    public String getSwimmingPoolArea() {
        return SwimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        SwimmingPoolArea = swimmingPoolArea;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa has stander: " + stander + ", Area swimming pool : " + SwimmingPoolArea +
                " , floor: " + floor;
    }
}
