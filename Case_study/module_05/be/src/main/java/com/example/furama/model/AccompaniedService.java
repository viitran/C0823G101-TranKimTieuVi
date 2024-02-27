package com.example.furama.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dich_vu_di_kem")
public class AccompaniedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private String unit;
    private String status;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;
    @OneToMany(mappedBy = "accompaniedService")
    private List<DetailedContract> detailedContracts;

    public AccompaniedService() {
    }

    public AccompaniedService(Integer id, String name, Double price, String unit, String status, Boolean isDelete, List<DetailedContract> detailedContracts) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.status = status;
        this.isDelete = isDelete;
        this.detailedContracts = detailedContracts;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public List<DetailedContract> getDetailedContracts() {
        return detailedContracts;
    }

    public void setDetailedContracts(List<DetailedContract> detailedContracts) {
        this.detailedContracts = detailedContracts;
    }
}
