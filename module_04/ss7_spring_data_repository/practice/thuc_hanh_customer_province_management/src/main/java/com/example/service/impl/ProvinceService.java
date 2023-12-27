package com.example.service.impl;

import com.example.model.Province;
import com.example.repository.IProvinceRepository;
import com.example.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository iProvinceRepository;


    @Override
    public Iterable<Province> findAll() {
        return iProvinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        iProvinceRepository.save(province);
    }

    @Override
    public Optional<Province> findById(Integer id) {
        return iProvinceRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iProvinceRepository.deleteById(id);
    }
}
