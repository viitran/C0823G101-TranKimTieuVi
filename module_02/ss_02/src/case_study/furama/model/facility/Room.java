package case_study.furama.model.facility;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceCode, String serviceName, String usableArea, String expense, String people,
                String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, String usableArea, String expense, String people, String rentalType) {
        super(serviceCode, serviceName, usableArea, expense, people, rentalType);
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room has freeService: " + freeService;
    }
}
