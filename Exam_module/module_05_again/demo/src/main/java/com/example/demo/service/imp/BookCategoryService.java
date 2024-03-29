package com.example.demo.service.imp;

import com.example.demo.model.BookCategory;
import com.example.demo.repository.IBookCategoryRepository;
import com.example.demo.service.IBookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService implements IBookCategoryService {
    @Autowired
    private IBookCategoryRepository iBookCategoryRepository;

    @Override
    public List<BookCategory> findAll() {
        return iBookCategoryRepository.findAll();
    }
}
