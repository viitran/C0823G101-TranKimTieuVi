package com.example.btt_01.repository;

import com.example.btt_01.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = " select tp.* from type_product tp left join product p on tp.id = p.category_id where tp.name like :name ",
            nativeQuery = true, countQuery = " select count(*) from (select tp.* from type_product tp left join product p on tp.id = p.category_id where tp.name like :name) temp ")
    Page<Category> findAllByName(Pageable pageable, @Param("name") String name);
}