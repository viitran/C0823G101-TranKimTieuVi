package com.example.furama.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dich_vu")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer area;
    private Double rentalCosts;
    private Integer maxPeople;
    private String roomStandards;
    private String otherDescribed;
    private Double swimmingPoolArea;
    private Integer floors;
    private String freeServiceIncluded;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "id_loai_dich_vu",referencedColumnName = "id")
    private TypeService typeService;

    @OneToMany(mappedBy = "service")
    private List<Contract> contracts;

    @ManyToOne
    @JoinColumn(name = "id_kieu_thue",referencedColumnName = "id")
    private TypeRental typeRental;

    public Service() {
    }

    public Service(Integer id, String name, Integer area, Double rentalCosts, Integer maxPeople, String roomStandards, String otherDescribed, Double swimmingPoolArea, Integer floors, String freeServiceIncluded, Boolean isDelete, TypeService typeService, List<Contract> contracts, TypeRental typeRental) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.roomStandards = roomStandards;
        this.otherDescribed = otherDescribed;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floors = floors;
        this.freeServiceIncluded = freeServiceIncluded;
        this.isDelete = isDelete;
        this.typeService = typeService;
        this.contracts = contracts;
        this.typeRental = typeRental;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public String getOtherDescribed() {
        return otherDescribed;
    }

    public void setOtherDescribed(String otherDescribed) {
        this.otherDescribed = otherDescribed;
    }

    public Double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public TypeRental getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(TypeRental typeRental) {
        this.typeRental = typeRental;
    }
}
