package com.example.demo.service;

import com.example.demo.model.BookCategory;

import java.util.List;

public interface IBookCategoryService {
    List<BookCategory> findAll();
}
