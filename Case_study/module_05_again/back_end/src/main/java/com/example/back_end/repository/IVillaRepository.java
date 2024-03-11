package com.example.back_end.repository;

import com.example.back_end.model.Villa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVillaRepository extends JpaRepository<Villa,Integer> {
}
