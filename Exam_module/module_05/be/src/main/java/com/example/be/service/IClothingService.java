package com.example.be.service;

import com.example.be.model.Clothing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IClothingService {
    List<Clothing> findAll();

    Clothing save(Clothing clothing);

    Optional<Clothing> findById(Integer id);

    void remove(Integer id);


    Page<Clothing> find(Pageable pageable, String name);
}
