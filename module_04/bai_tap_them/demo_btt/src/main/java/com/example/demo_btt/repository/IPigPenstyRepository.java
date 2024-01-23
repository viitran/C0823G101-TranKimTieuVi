package com.example.demo_btt.repository;

import com.example.demo_btt.model.PigPensty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPigPenstyRepository extends JpaRepository<PigPensty,Integer> {
}
