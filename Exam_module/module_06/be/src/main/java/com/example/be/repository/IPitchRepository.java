package com.example.be.repository;

import com.example.be.DTO.RequestDto;
import com.example.be.model.Pitch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPitchRepository extends JpaRepository<Pitch, Integer> {
    @Query(value = "select * from san_bong where " +
            "san_bong.is_delete = 0", nativeQuery = true)
    List<Pitch> getAll();

    @Modifying
    @Transactional
    @Query(value = "update san_bong set san_bong.is_delete = 1 where san_bong.id = :id ", nativeQuery = true)
    void removePitchById(@Param("id") Integer id);

//    @Query(value = "select * from san_bong as sb" +
//            "left join khu_vuc as kv on sb.id_area = kv.id" +
//            "left join loai_san as ls on sb.id_type = kv.type",nativeQuery = true)
//    Page<Pitch> findAllPageList(RequestDto requestDto);

//    @Query(value = "",nativeQuery = true)
//    Page<Pitch> findAllPage(@Param("requestDto")RequestDto requestDto, Pageable pageable);
}
