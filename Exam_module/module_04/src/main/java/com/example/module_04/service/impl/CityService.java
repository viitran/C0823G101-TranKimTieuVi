package com.example.module_04.service.impl;

import com.example.module_04.model.City;
import com.example.module_04.repository.ICityRepository;
import com.example.module_04.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository iCityRepository;
    @Override
    public Iterable<City> findAll() {
        return iCityRepository.findAll();
    }

    @Override
    public void save(City city) {
        iCityRepository.save(city);
    }

    @Override
    public Optional<City> findById(Integer id) {
        return iCityRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iCityRepository.deleteById(id);
    }
}
