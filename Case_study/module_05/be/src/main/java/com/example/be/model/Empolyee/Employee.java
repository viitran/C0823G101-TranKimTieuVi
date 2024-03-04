package com.example.be.model.Empolyee;

import java.util.List;

import com.example.be.model.Contract;

import jakarta.persistence.*;

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
    private String phone;
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "vi_tri", referencedColumnName = "id")
    private TypeEmployee typeEmployee;

    @ManyToOne
    @JoinColumn(name = "trinh_do", referencedColumnName = "id")
    private QualificationsEmployee qualificationsEmployee;

    @ManyToOne
    @JoinColumn(name = "bo_phan", referencedColumnName = "id")
    private DepartmentEmployee departmentEmployee;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String identity, Double salary, String phone, String email, String address, TypeEmployee typeEmployee, QualificationsEmployee qualificationsEmployee, DepartmentEmployee departmentEmployee, List<Contract> contracts) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.identity = identity;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.typeEmployee = typeEmployee;
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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
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
