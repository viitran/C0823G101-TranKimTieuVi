package com.example.btt_01.service.impl;

import com.example.btt_01.model.Category;
import com.example.btt_01.repository.ICategoryRepository;
import com.example.btt_01.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public Page<Category> find(Pageable pageable, String name) {
        return iCategoryRepository.findAllByName (pageable, "%" + name + "%");
    }
}