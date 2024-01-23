package com.example.module_04.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;


@Entity
@Table(name = "thanh_pho")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ten;
    private Long dienTich;
    private Integer danSo;
    private Long GDP;

    private String moTa;
    @ManyToOne
    @JoinColumn(columnDefinition = "country_id",referencedColumnName = "id")
    private Country country;

    public City() {
    }

    public City(Integer id, String ten, Long dienTich, Integer danSo, Long GDP, String moTa, Country country) {
        this.id = id;
        this.ten = ten;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Long getDienTich() {
        return dienTich;
    }

    public void setDienTich(Long dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getDanSo() {
        return danSo;
    }

    public void setDanSo(Integer danSo) {
        this.danSo = danSo;
    }

    public Long getGDP() {
        return GDP;
    }

    public void setGDP(Long GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
