package com.example.back_end.service.impl;

import com.example.back_end.model.House;
import com.example.back_end.repository.IHouseRepository;
import com.example.back_end.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService implements IHouseService {
    @Autowired
    private IHouseRepository iHouseRepository;

    @Override
    public List<House> findAll() {
        return iHouseRepository.findAll();
    }

    @Override
    public void save(House house) {
        iHouseRepository.save(house);
    }

    @Override
    public Optional<House> findById(Integer id) {
        return iHouseRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iHouseRepository.deleteById(id);
    }
}
