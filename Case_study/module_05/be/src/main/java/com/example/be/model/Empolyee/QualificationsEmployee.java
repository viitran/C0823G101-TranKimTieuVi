package com.example.be.model.Empolyee;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "trinh_do")
public class QualificationsEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "qualificationsEmployee")
    private List<Employee> employees;

    public QualificationsEmployee() {
    }

    public QualificationsEmployee(Integer id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
