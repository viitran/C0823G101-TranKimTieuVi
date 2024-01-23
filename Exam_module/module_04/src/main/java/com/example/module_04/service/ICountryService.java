package com.example.module_04.service;

import com.example.module_04.model.City;
import com.example.module_04.model.Country;

import java.util.Optional;

public interface ICountryService {
    Iterable<Country> findAll();
    void save(Country country);
    Optional<Country> findById(Integer id);
    void deleteById(Integer id);
}
