package com.example.furama.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "khach_hang")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String birthday;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean gender;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;
    private String identity;
    private String phoneNumber;
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_loai_khach",referencedColumnName = "id")
    private TypeCustomer typeCustomer;

   @OneToMany(mappedBy = "customer")
    private List<Contract> contract;

    public Customer() {
    }

    public Customer(Integer id, String name, String birthday, Boolean gender, Boolean isDelete, String identity, String phoneNumber, String email, String address, TypeCustomer typeCustomer, List<Contract> contract) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.isDelete = isDelete;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.typeCustomer = typeCustomer;
        this.contract = contract;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public List<Contract> getContract() {
        return contract;
    }

    public void setContract(List<Contract> contract) {
        this.contract = contract;
    }
}
