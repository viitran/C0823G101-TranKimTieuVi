package com.example.myblog.service.impl;

import com.example.myblog.model.Category;
import com.example.myblog.repository.ICategoryRepository;
import com.example.myblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void remove(Integer id) {
        iCategoryRepository.deleteById(id);
    }
}
