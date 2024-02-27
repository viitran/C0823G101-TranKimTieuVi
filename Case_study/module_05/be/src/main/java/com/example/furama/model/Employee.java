package com.example.furama.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "nhan_vien")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String birthday;
    private String identity;
    private Double salary;
    private String phoneNumber;
    private String email;
    private String address;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_vi_tri", referencedColumnName = "id")
    private PositionEmployee positionEmployee;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_trinh_do",referencedColumnName = "id")
    private QualificationsEmployee qualificationsEmployee;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_bo_phan",referencedColumnName = "id")
    private DepartmentEmployee departmentEmployee;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String identity, Double salary, String phoneNumber, String email, String address, Boolean isDelete, PositionEmployee positionEmployee, QualificationsEmployee qualificationsEmployee, DepartmentEmployee departmentEmployee, List<Contract> contracts) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.identity = identity;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.isDelete = isDelete;
        this.positionEmployee = positionEmployee;
        this.qualificationsEmployee = qualificationsEmployee;
        this.departmentEmployee = departmentEmployee;
        this.contracts = contracts;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String date) {
        this.birthday = date;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public PositionEmployee getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(PositionEmployee positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public QualificationsEmployee getQualificationsEmployee() {
        return qualificationsEmployee;
    }

    public void setQualificationsEmployee(QualificationsEmployee qualificationsEmployee) {
        this.qualificationsEmployee = qualificationsEmployee;
    }

    public DepartmentEmployee getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
