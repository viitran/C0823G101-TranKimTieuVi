package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.BookCategory;
import com.example.demo.model.DTO.BookDTO;
import com.example.demo.repository.IBookCategoryRepository;
import com.example.demo.repository.IBookRepository;
import com.example.demo.service.IBookCategoryService;
import com.example.demo.service.IBookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class BookRestController {
    @Autowired
    private IBookCategoryService iBookCategoryService;
    @Autowired
    private IBookService iBookService;


    @GetMapping("/category")
    public ResponseEntity<List<BookCategory>> getAllCate() {
        return new ResponseEntity<>(this.iBookCategoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Book>> getAllBook() {
        return new ResponseEntity<>(this.iBookService.findAllBook(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Book> save(@RequestBody Book book) {
        Book create = this.iBookService.save(book);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.iBookService.findBookById(id), HttpStatus.OK);
    }


    @PatchMapping("/edit/{id}")
    public ResponseEntity<?> update(@RequestBody BookDTO bookDTO, @PathVariable Long id) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDTO, book);
        this.iBookService.updateBookById(book,id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove (@RequestBody Book book,@PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
