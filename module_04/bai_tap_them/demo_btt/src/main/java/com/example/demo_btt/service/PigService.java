package com.example.demo_btt.service;

import com.example.demo_btt.model.Pig;
import com.example.demo_btt.repository.IPigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PigService implements IPigService{
    @Autowired
    private IPigRepository iPigRepository;
    @Override
    public Iterable<Pig> findAll() {
        return iPigRepository.findAll();
    }

    @Override
    public void save(Pig pig) {
        iPigRepository.save(pig);
    }

    @Override
    public Optional<Pig> findById(Integer id) {
        return iPigRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iPigRepository.deleteById(id);
    }
}
