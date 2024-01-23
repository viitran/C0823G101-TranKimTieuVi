package com.example.module_04.repository;

import com.example.module_04.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country,Integer> {
}
