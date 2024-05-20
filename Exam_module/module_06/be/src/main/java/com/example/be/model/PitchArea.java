package com.example.be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "khu_vuc")
@Getter
@Setter
public class PitchArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public PitchArea() {
    }

    public PitchArea(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
