package com.example.be.repository;

import com.example.be.model.Clothing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IClothingRepo extends JpaRepository<Clothing,Integer> {
    @Query(nativeQuery = true,
    value = "select c.* from clothing c join category cate on c.categories_id = cate.id where c.name like :name")
    Page<Clothing> findAllByName(Pageable pageable, @Param("name") String name);
}
