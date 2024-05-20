package com.example.be.service.impl;

import com.example.be.model.PitchArea;
import com.example.be.repository.IPitchAreaRepository;
import com.example.be.service.IPitchAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchAreaService implements IPitchAreaService {
    @Autowired
    private IPitchAreaRepository iPitchAreaRepository;

    @Override
    public List<PitchArea> findAllArea() {
        return iPitchAreaRepository.getAllArea();
    }
}
