package model;

public class SpendingDTO {
    private int id;
    private String name;
    private String date;
    private Double price;
    private String description;
    private String nameType;
    private int typeId;


    public SpendingDTO(int id, String name, String date, Double price, String description, String nameType) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.nameType = nameType;
    }

    public SpendingDTO(int id, String name, String date, Double price, String description, String nameType, int typeId) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.nameType = nameType;
        this.typeId = typeId;
    }

    public SpendingDTO(String name, String date, Double price, String description, String nameType) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.nameType = nameType;
    }

    public SpendingDTO(String name, String date, Double price, String description, int typeId) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
        this.typeId = typeId;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
