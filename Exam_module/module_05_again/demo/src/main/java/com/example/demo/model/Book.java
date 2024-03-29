package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Integer quantity;
    private String date;
    @Column(columnDefinition = "bit(1) default 0")
    private boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sach",referencedColumnName = "id")
    private BookCategory bookCategory;

    public Book() {
    }

    public Book(Long id, String name, String code, Integer quantity, String date, boolean isDelete, BookCategory bookCategory) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.date = date;
        this.isDelete = isDelete;
        this.bookCategory = bookCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
}
