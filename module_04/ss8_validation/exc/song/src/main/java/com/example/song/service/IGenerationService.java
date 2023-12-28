package com.example.song.service;

import java.util.Optional;

public interface IGenerationService<T> {
    Iterable<T> findAll();
    void save(T t);
    Optional<T> findById(Integer id);
    void remove(Integer id);
}
