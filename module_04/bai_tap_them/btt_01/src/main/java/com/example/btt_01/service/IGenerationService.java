package com.example.btt_01.service;

import java.util.Optional;

public interface IGenerationService<T> {
    Iterable<T> findAll();
    void save(T t);
    Optional<T> findById(Integer id);
    void deleteById(Integer id);
}
