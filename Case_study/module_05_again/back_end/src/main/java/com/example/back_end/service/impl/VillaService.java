package com.example.back_end.service.impl;

import com.example.back_end.model.Villa;
import com.example.back_end.repository.IVillaRepository;
import com.example.back_end.service.IVillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VillaService implements IVillaService {
    @Autowired
    private IVillaRepository iVillaRepository;

    @Override
    public List<Villa> findAll() {
        return iVillaRepository.findAll();
    }

    @Override
    public void save(Villa villa) {
        iVillaRepository.save(villa);
    }

    @Override
    public Optional<Villa> findById(Integer id) {
        return iVillaRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iVillaRepository.deleteById(id);
    }
}
