package com.example.back_end.model.Employee;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vi_tri")
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public EmployeePosition() {
    }

    public EmployeePosition(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
