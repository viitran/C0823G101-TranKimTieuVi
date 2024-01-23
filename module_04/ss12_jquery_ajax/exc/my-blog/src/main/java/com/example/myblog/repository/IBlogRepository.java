package com.example.myblog.repository;



import com.example.myblog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Comparator;


public interface IBlogRepository extends JpaRepository<Blog,Integer> {

    @Query(value = " select b.* from blog b join category c on b.category_id = c.id where b.name like :name ",
            nativeQuery = true, countQuery = " select count(*) from (select b.* from blog b join category c on b.category_id = c.id where b.name like :name) temp ")
    Page<Blog> findAllByName(Pageable pageable, @Param("name") String name);

}
