package com.example.furama.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hop_dong_chi_tiet")
public class DetailedContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "id_hop_dong",referencedColumnName = "id")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_dich_vu_di_kem",referencedColumnName = "id")
    private AccompaniedService accompaniedService;

    public DetailedContract() {
    }

    public DetailedContract(Integer id, Integer quantity, Boolean isDelete, Contract contract, AccompaniedService accompaniedService) {
        this.id = id;
        this.quantity = quantity;
        this.isDelete = isDelete;
        this.contract = contract;
        this.accompaniedService = accompaniedService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AccompaniedService getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(AccompaniedService accompaniedService) {
        this.accompaniedService = accompaniedService;
    }
}
