package com.example.be.repository;

import com.example.be.model.PitchArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPitchAreaRepository extends JpaRepository<PitchArea, Integer> {
    @Query(value = "select * from khu_vuc", nativeQuery = true)
    List<PitchArea> getAllArea();
}
