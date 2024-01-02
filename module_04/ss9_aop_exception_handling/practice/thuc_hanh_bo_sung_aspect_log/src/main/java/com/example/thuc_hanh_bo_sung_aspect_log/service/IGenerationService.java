package com.example.thuc_hanh_bo_sung_aspect_log.service;

import java.util.Optional;

public interface IGenerationService<T>{
    Iterable<T> findAll();
    void save(T t);
    Optional<T> findById(Integer id);
    void deleteById(Integer id);
}
