package com.example.be.service;

import com.example.be.DTO.PitchDto;
import com.example.be.DTO.RequestDto;
import com.example.be.model.Pitch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPitchService {
    List<Pitch> getAllPitch();
    void deletePitch(Integer id);
    void createPitch(PitchDto pitchDto);
    void save(Pitch pitch);

//    Page<Pitch> findAllPage(RequestDto requestDto);
}
