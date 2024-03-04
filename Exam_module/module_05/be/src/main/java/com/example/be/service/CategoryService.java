package com.example.be.service;

import com.example.be.model.Category;
import com.example.be.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepo iCategoryRepo;
    @Override
    public List<Category> findAllCate() {
        return iCategoryRepo.findAll();
    }
}

