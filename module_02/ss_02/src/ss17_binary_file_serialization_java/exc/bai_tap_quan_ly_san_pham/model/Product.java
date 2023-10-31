package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private long price;
    private String address;
    private String description;

    public Product(int id, String name, long price, String address, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.description = description;
    }

    public Product(String name, long price, String address, String description) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.description = description;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " id: " + id +
                " | name: " + name +
                " | price: " + price +
                " | address: " + address + " | description: " + description;
    }
}
