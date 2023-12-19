package model;

public class SpendingType {
    private int typeId;
    private String name;

    public SpendingType(int typeId, String name) {
        this.typeId = typeId;
        this.name = name;
    }

    public SpendingType() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
