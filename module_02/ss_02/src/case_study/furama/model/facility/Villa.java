package case_study.furama.model.facility;

public class Villa extends Facility {
    private String stander;
    private Double SwimmingPoolArea;
    private int floor;

    public Villa(String Code, String Name, Double usableArea, Long expense, int people, String rentalType) {
        super(Code, Name, usableArea, expense, people, rentalType);
    }

    public Villa(String Code, String Name, Double usableArea, Long expense, int people, String rentalType,
                 String stander, Double swimmingPoolArea, int floor) {
        super(Code, Name, usableArea, expense, people, rentalType);
        this.stander = stander;
        SwimmingPoolArea = swimmingPoolArea;
        this.floor = floor;
    }


    public String getStander() {
        return stander;
    }

    public void setStander(String stander) {
        this.stander = stander;
    }

    public Double getSwimmingPoolArea() {
        return SwimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        SwimmingPoolArea = swimmingPoolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVilla has stander: " + stander + ", Area swimming pool : " + SwimmingPoolArea +
                "m^2 , floor: " + floor;
    }
}
