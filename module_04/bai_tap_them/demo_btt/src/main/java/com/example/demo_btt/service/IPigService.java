package com.example.demo_btt.service;

import com.example.demo_btt.model.Pig;

import java.util.Optional;

public interface IPigService {
    Iterable<Pig> findAll();
    void save(Pig pig);
    Optional<Pig> findById(Integer id);
    void deleteById(Integer id);
}
