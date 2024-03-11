package com.example.back_end.model;

import jakarta.persistence.*;

@Entity
@Table(name = "villa")
public class Villa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameService;
    private Long usableArea;
    private Long rentalCosts;
    private Integer maximumOccupancy;
    private String rentalType;
    private Long roomStandards;
    private Long poolArea;
    private Integer numberOfFloor;
    private String otherDescription;

    public Villa() {
    }

    public Villa(Integer id, String nameService, Long usableArea, Long rentalCosts, Integer maximumOccupancy, String rentalType, Long roomStandards, Long poolArea, Integer numberOfFloor, String otherDescription) {
        this.id = id;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumOccupancy = maximumOccupancy;
        this.rentalType = rentalType;
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.otherDescription = otherDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    public Long getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(Long roomStandards) {
        this.roomStandards = roomStandards;
    }

    public Long getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Long poolArea) {
        this.poolArea = poolArea;
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
}
