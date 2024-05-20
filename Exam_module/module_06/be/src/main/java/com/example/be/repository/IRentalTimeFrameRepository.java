package com.example.be.repository;

import com.example.be.model.RentalTimeFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IRentalTimeFrameRepository extends JpaRepository<RentalTimeFrame, Integer> {
    @Query(value = "select * from khung_gio_cho_thue ", nativeQuery = true)
    List<RentalTimeFrame> getAll();
}
