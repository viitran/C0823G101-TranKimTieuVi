package com.example.back_end.model;

import jakarta.persistence.*;

@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long usableArea;
    private Long rentalCosts;
    private Integer maximumOccupancy;
    private String rentalType;
    private Integer numberOfFloor;
    private String otherDescription;
    private Long roomStandards;

    public House() {
    }

    public House(Integer id, Long usableArea, Long rentalCosts, Integer maximumOccupancy, String rentalType, Integer numberOfFloor, String otherDescription, Long roomStandards) {
        this.id = id;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumOccupancy = maximumOccupancy;
        this.rentalType = rentalType;
        this.numberOfFloor = numberOfFloor;
        this.otherDescription = otherDescription;
        this.roomStandards = roomStandards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Long usableArea) {
        this.usableArea = usableArea;
    }

    public Long getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Long rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(Integer maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public Long getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(Long roomStandards) {
        this.roomStandards = roomStandards;
    }
}
