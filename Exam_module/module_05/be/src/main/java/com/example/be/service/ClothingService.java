package com.example.be.service;

import com.example.be.model.Clothing;
import com.example.be.repository.IClothingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothingService implements IClothingService{
    @Autowired
    private IClothingRepo iClothingRepo;


    @Override
    public List<Clothing> findAll() {
        return iClothingRepo.findAll();
    }

    @Override
    public Clothing save(Clothing clothing) {
       return iClothingRepo.save(clothing);
    }

    @Override
    public Optional<Clothing> findById(Integer id) {
        return iClothingRepo.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iClothingRepo.deleteById(id);
    }

    @Override
    public Page<Clothing> find(Pageable pageable, String name) {
        return iClothingRepo.findAllByName(pageable,"%"+name+"%");
    }


}
