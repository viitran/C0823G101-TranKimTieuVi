package com.example.myblog.service;


import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    List<T> findAll();
    void save(T t);
    Optional<T> findById(Integer id);

    void remove(Integer id);}
