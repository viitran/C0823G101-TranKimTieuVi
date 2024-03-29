package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.DTO.BookDTO;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    Book save(Book book);

    void remove(Long id);

    Optional<Book> findById(Long id);

    List<Book> findAllBook();

    Book findBookById(Long id);

    void updateBookById(Book book, Long id);

    void removeBookById(Long id);

}
