package com.example.be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loai_san")
@Getter
@Setter
public class PitchType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public PitchType() {
    }

    public PitchType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
