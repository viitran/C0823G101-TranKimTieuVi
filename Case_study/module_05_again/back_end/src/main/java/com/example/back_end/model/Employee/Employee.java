package com.example.back_end.model.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "nhan_vien")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ho_ten")
    private String name;
    @Column(name = "ngay_sinh")
    private String date;
    @Column(name = "so_cmnd")
    private String identity;
    @Column(name = "so_dien_thoai")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(columnDefinition = "bit(1) default 0")
    private boolean isDelete;

    @Column(name = "luong",columnDefinition = "double default 2000000")
    private Long salary;


    @ManyToOne
    @JoinColumn(name = "ma_trinh_do", referencedColumnName = "id")
    private EmployeeQualifications employeeQualifications;

    @ManyToOne
    @JoinColumn(name = "ma_vi_tri",referencedColumnName = "id")
    private EmployeePosition employeePosition;

    @ManyToOne
    @JoinColumn(name = "ma_bo_phan",referencedColumnName = "id")
    private EmployeeWorkingParts employeeWorkingParts;

    public Employee() {
    }

    public Employee(Integer id, String name, String date, String identity, String phoneNumber, String email, boolean isDelete, Long salary, EmployeeQualifications employeeQualifications, EmployeePosition employeePosition, EmployeeWorkingParts employeeWorkingParts) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isDelete = isDelete;
        this.salary = salary;
        this.employeeQualifications = employeeQualifications;
        this.employeePosition = employeePosition;
        this.employeeWorkingParts = employeeWorkingParts;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public EmployeeQualifications getEmployeeQualifications() {
        return employeeQualifications;
    }

    public void setEmployeeQualifications(EmployeeQualifications employeeQualifications) {
        this.employeeQualifications = employeeQualifications;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployeeWorkingParts getEmployeeWorkingParts() {
        return employeeWorkingParts;
    }

    public void setEmployeeWorkingParts(EmployeeWorkingParts employeeWorkingParts) {
        this.employeeWorkingParts = employeeWorkingParts;
    }
}
