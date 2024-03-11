package com.example.back_end.model;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameService;
    private Long usableArea;
    private Long rentalCosts;
    private Integer maximumOccupancy;
    private String rentalType;
    private String serviceIncluded;

    public Room() {
    }

    public Room(Long id, String nameService, Long usableArea, Long rentalCosts, Integer maximumOccupancy, String rentalType, String serviceIncluded) {
        this.id = id;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumOccupancy = maximumOccupancy;
        this.rentalType = rentalType;
        this.serviceIncluded = serviceIncluded;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }
}
