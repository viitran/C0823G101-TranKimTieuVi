package com.example.be.service.impl;

import com.example.be.model.RentalTimeFrame;
import com.example.be.repository.IRentalTimeFrameRepository;
import com.example.be.service.IRentalTimeFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalTimeFrameService implements IRentalTimeFrameService {

    @Autowired
    private IRentalTimeFrameRepository iRentalTimeFrameRepository;

    @Override
    public List<RentalTimeFrame> findAll() {
        return this.iRentalTimeFrameRepository.getAll();
    }
}
