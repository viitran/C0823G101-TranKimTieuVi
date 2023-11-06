package case_study.furama.model.facility;

public class Facility {
    private String Code;
    private String Name;
    private Double usableArea;
    private Long expense;
    private int people;
    private String rentalType;

    public Facility(String Code, String Name, Double usableArea, Long expense, int people,
                    String rentalType) {
        this.Code = Code;
        this.Name = Name;
        this.usableArea = usableArea;
        this.expense = expense;
        this.people = people;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Long getExpense() {
        return expense;
    }

    public void setExpense(Long expense) {
        this.expense = expense;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Code: " + Code +
                " | Name: " + Name +
                " | usableArea: " + usableArea +
                "m^2 | expense: " + expense +
                " | people: " + people +
                " | rentalType: " + rentalType;
    }
}
