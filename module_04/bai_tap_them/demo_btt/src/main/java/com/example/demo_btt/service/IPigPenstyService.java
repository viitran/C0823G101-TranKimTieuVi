package com.example.demo_btt.service;

import com.example.demo_btt.model.PigPensty;

import java.util.Optional;

public interface IPigPenstyService {
    Iterable<PigPensty> findAll();
    void save(PigPensty pigPensty);
    Optional<PigPensty> findById(Integer id);
    void deleteById(Integer id);
}
