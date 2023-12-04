package com.example.bai_tap_list_customer;

public class Customer {
    private String name;
    private String birthday;
    private String location;
    private String picture;

    public Customer(String name, String birthday, String location, String picture) {
        this.name = name;
        this.birthday = birthday;
        this.location = location;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
