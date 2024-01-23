package com.example.demo_btt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chuong")
public class PigPensty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "bit(1) default 0")
    private boolean isDelete;
    @OneToMany(mappedBy = "pigPensty")
    private List<Pig> pigs;

    public PigPensty() {
    }

    public PigPensty(Integer id, String name, boolean isDelete, List<Pig> pigs) {
        this.id = id;
        this.name = name;
        this.isDelete = isDelete;
        this.pigs = pigs;
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

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public List<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(List<Pig> pigs) {
        this.pigs = pigs;
    }
}


