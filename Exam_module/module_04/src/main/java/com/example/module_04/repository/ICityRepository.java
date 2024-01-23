package com.example.module_04.repository;

import com.example.module_04.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City,Integer> {
}

