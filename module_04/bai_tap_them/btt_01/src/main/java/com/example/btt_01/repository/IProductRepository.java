package com.example.btt_01.repository;

import com.example.btt_01.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = " select p.* from product p join type_product c on p.category_id = c.id where p.name like :name ",
            nativeQuery = true, countQuery = " select count(*) from (select p.* from product p join category c on p.category_id = c.id where p.name like :name) temp ")
    Page<Product> findAllByName(Pageable pageable, @Param("name") String name);
}
