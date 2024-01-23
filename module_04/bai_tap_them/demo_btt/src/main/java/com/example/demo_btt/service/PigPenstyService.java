package com.example.demo_btt.service;

import com.example.demo_btt.model.PigPensty;
import com.example.demo_btt.repository.IPigPenstyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PigPenstyService implements IPigPenstyService {
    @Autowired
    private IPigPenstyRepository iPigPenstyRepository;

    @Override
    public Iterable<PigPensty> findAll() {
        return iPigPenstyRepository.findAll();
    }

    @Override
    public void save(PigPensty pigPensty) {
        iPigPenstyRepository.save(pigPensty);
    }

    @Override
    public Optional<PigPensty> findById(Integer id) {
        return iPigPenstyRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iPigPenstyRepository.deleteById(id);
    }
}
