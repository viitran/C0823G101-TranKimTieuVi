package case_study.furama.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String Code, String Name, Double usableArea, Long expense, int people, String rentalType, String freeService) {
        super(Code, Name, usableArea, expense, people, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRoom has freeService: " + freeService;
    }
}
