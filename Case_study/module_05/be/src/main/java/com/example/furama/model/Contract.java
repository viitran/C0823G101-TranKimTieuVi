package com.example.furama.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String startDay;
    private String endDay;
    private Double deposits;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_nhan_vien",referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang",referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_dich_vu",referencedColumnName = "id")
    private Service service;

    @OneToMany(mappedBy = "contract")
    private List<DetailedContract> detailedContracts;

    public Contract() {
    }

    public Contract(Integer id, String startDay, String endDay, Double deposits, Boolean isDelete, Employee employee, Customer customer, Service service, List<DetailedContract> detailedContracts) {
        this.id = id;
        this.startDay = startDay;
        this.endDay = endDay;
        this.deposits = deposits;
        this.isDelete = isDelete;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.detailedContracts = detailedContracts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Double getDeposits() {
        return deposits;
    }

    public void setDeposits(Double deposits) {
        this.deposits = deposits;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<DetailedContract> getDetailedContracts() {
        return detailedContracts;
    }

    public void setDetailedContracts(List<DetailedContract> detailedContracts) {
        this.detailedContracts = detailedContracts;
    }
}
