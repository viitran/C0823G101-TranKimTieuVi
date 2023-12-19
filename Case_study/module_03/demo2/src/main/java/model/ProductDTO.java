package model;

public class ProductDTO {
private int id;
private String code;
private String name;
private String unit;
private double price;
private String typeName;
private String date;
private int typeId;

    public ProductDTO(int id, String code, String name, String unit, double price, String typeName, String date) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.typeName = typeName;
        this.date = date;
    }

    public ProductDTO(int id, String code, String name, String unit, double price, String typeName, String date, int typeId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.typeName = typeName;
        this.date = date;
        this.typeId = typeId;
    }

    public ProductDTO(String code, String name, String unit, double price, String date, int typeId) {
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.date = date;
        this.typeId = typeId;
    }

    public ProductDTO(int id, String code, String name, String unit, double price, int typeId, String date ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.typeId = typeId;
        this.date = date;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
