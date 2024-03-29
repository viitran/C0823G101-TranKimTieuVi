package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.DTO.BookDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from book where book.is_delete = 0", nativeQuery = true)
    List<Book> findAllBook();

    @Query(value = "select * from book where book.id = :id", nativeQuery = true)
    Book findBookById(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query(value = "update book " +
            "set name = :#{#book.name} , " +
            "date = :#{#book.date} , " +
            "quantity = :#{#book.quantity} , ma_loai_sach = :#{#book.getBookCategory().getId()} " +
            " where id = :id", nativeQuery = true)
    void updateBookById(@Param("book") Book book,
                           @Param("id") Long id);


    @Query(value = "update book set is_delete = 1 where book.id = :id",nativeQuery = true)
    void deleteBookById(@Param("id") Long id);
}
