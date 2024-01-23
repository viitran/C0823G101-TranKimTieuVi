package com.example.module_04.service;

import com.example.module_04.model.City;

import java.util.Optional;

public interface ICityService {
    Iterable<City> findAll();
    void save(City city);
    Optional<City> findById(Integer id);
    void deleteById(Integer id);
}
