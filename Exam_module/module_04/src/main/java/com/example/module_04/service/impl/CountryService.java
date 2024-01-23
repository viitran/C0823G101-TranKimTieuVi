package com.example.module_04.service.impl;

import com.example.module_04.model.Country;
import com.example.module_04.repository.ICountryRepository;
import com.example.module_04.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository iCountryRepository;
    @Override
    public Iterable<Country> findAll() {
        return iCountryRepository.findAll();
    }

    @Override
    public void save(Country country) {
        iCountryRepository.save(country);
    }

    @Override
    public Optional<Country> findById(Integer id) {
        return iCountryRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iCountryRepository.deleteById(id);
    }
}
