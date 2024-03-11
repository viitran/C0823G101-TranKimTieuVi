package com.example.back_end.model.Employee;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trinh_do")
public class EmployeeQualifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public EmployeeQualifications(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeQualifications() {
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
