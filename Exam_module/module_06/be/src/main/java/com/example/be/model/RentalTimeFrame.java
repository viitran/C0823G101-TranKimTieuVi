package com.example.be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "khung_gio_cho_thue")
@Getter
@Setter
public class RentalTimeFrame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String time;
    private Double price;

    public RentalTimeFrame() {
    }

    public RentalTimeFrame(Integer id, String time, Double price ) {
        this.id = id;
        this.time = time;
        this.price = price;
    }
}
