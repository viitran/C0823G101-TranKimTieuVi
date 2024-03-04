package com.example.be.model;

import com.example.be.model.Empolyee.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String startDate;
    private String endDate;
    private Double deposit;
    @ManyToOne
    @JoinColumn(name = "nhan_vien", referencedColumnName = "id")
    private Employee employee;


}
