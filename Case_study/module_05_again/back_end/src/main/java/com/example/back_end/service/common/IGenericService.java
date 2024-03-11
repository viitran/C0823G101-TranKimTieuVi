package com.example.back_end.service.common;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
    List<T> findAll();

    void save(T t);

    Optional<T> findById(Integer id);

    void remove(Integer id);
}

