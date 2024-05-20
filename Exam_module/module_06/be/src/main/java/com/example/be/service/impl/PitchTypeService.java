package com.example.be.service.impl;

import com.example.be.model.PitchType;
import com.example.be.repository.IPitchTypeRepository;
import com.example.be.service.IPitchTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchTypeService implements IPitchTypeService {
    @Autowired
    private IPitchTypeRepository iPitchTypeRepository;

    @Override
    public List<PitchType> findAllType() {
        return this.iPitchTypeRepository.getAllType();
    }
}
