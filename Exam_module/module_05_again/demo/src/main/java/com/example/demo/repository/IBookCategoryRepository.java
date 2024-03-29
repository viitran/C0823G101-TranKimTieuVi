package com.example.demo.repository;

import com.example.demo.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookCategoryRepository extends JpaRepository<BookCategory,Long> {
}
