package com.example.be.repository;

import com.example.be.model.PitchType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPitchTypeRepository extends JpaRepository<PitchType,Integer> {

    @Query(value = "select * from loai_san",nativeQuery = true)
    List<PitchType> getAllType();
}
