package com.example.myblog.service;


import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    List<T> findAll();
    T save(T t);
    T findById(Integer id);

    void remove(Integer id);}
