package com.example.thuc_hanh.service;

import com.example.thuc_hanh.model.Smartphone;
import com.example.thuc_hanh.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService{
    @Autowired
    private ISmartphoneRepository iSmartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return iSmartphoneRepository.findAll();
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
      return  iSmartphoneRepository.save(smartphone);
    }

    @Override
    public Optional<Smartphone> findById(Integer id) {
        return iSmartphoneRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iSmartphoneRepository.deleteById(id);
    }
}
