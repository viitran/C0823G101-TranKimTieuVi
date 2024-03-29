package com.example.demo.service.imp;

import com.example.demo.model.Book;
import com.example.demo.repository.IBookRepository;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return iBookRepository.save(book);
    }

    @Override
    public void remove(Long id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return iBookRepository.findById(id);
    }

    @Override
    public List<Book> findAllBook() {
        return iBookRepository.findAllBook();
    }

    @Override
    public Book findBookById(Long id) {
        return iBookRepository.findBookById(id);
    }


    @Override
    public void updateBookById(Book book,Long id) {
        iBookRepository.updateBookById(book,id);
    }

    @Override
    public void removeBookById(Long id) {
        iBookRepository.deleteBookById(id);
    }


}
