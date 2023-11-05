package case_study.furama.model.facility;

public class House extends Facility{
    private String standard;
    private int floor;

    public House(String Code, String Name, Double usableArea, Long expense, int people, String rentalType,
                 String standard, int floor) {
        super(Code, Name, usableArea, expense, people, rentalType);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nHouse has standard: " + standard + ", floor: " + floor;
    }
}
