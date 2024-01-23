package com.example.thuc_hanh.service;

import com.example.thuc_hanh.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone save (Smartphone smartphone);
    Optional<Smartphone> findById(Integer id);
    void deleteById(Integer id);
}
