package com.example.back_end.model.Employee;


import jakarta.persistence.*;

@Entity
@Table(name = "bo_phan")
public class EmployeeWorkingParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public EmployeeWorkingParts() {
    }

    public EmployeeWorkingParts(Integer id, String name) {
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
