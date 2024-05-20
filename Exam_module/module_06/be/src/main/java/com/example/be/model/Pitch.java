package com.example.be.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "san_bong")
@Setter
@Getter
public class Pitch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    @Column(columnDefinition = "bit(1) default 0")
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    private PitchArea pitchArea;

    @ManyToOne
    @JoinColumn(name = "id_type",referencedColumnName = "id")
    private PitchType pitchTypes;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id",name = "id_time")
    private RentalTimeFrame rentalTimeFrames;

    public Pitch() {
    }


}
