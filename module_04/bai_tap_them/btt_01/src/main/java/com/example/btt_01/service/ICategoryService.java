package com.example.btt_01.service;

import com.example.btt_01.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService extends IGenerationService<Category> {
    Page<Category> find(Pageable pageable, String name);
}
