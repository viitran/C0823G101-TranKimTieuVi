package com.example.be.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy="category")
    @JsonBackReference
    private List<Clothing> clothing;

    public Category() {
    }

    public Category(Integer id, String name, List<Clothing> clothing) {
        this.id = id;
        this.name = name;
        this.clothing = clothing;
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

    public List<Clothing> getClothing() {
        return clothing;
    }

    public void setClothing(List<Clothing> clothing) {
        this.clothing = clothing;
    }
}