package com.example.back_end.repository;

import com.example.back_end.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHouseRepository extends JpaRepository<House,Integer> {
}
