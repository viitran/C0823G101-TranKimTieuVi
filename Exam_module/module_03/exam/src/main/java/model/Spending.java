package model;

public class Spending {
    private int id;
    private String name;
    private String date;
    private Double price;
    private String description;

    public Spending(int id, String name, String date, Double price, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.description = description;
    }

    public Spending() {
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
}
