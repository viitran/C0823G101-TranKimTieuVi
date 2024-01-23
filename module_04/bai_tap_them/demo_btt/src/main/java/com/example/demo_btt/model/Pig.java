package com.example.demo_btt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lon")
public class Pig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Double weight;
    @Column(columnDefinition = "bit(1) default 0")
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "pig_pensty_id",referencedColumnName = "id")
    private PigPensty pigPensty;

    public Pig() {
    }

    public Pig(Integer id, String name, Integer age, String gender, Double weight, boolean isDelete, PigPensty pigPensty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.isDelete = isDelete;
        this.pigPensty = pigPensty;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public PigPensty getPigPensty() {
        return pigPensty;
    }

    public void setPigPensty(PigPensty pigPensty) {
        this.pigPensty = pigPensty;
    }
}
