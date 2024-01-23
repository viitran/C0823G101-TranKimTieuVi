package com.example.demo_btt.repository;

import com.example.demo_btt.model.Pig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface IPigRepository extends JpaRepository<Pig,Integer> {
    @Query(value = "update lon l set l.is_delete = true where l.id = :id",nativeQuery = true)
    @Transactional
    @Modifying
    void deleteById(@Param("id") Integer id);

}
