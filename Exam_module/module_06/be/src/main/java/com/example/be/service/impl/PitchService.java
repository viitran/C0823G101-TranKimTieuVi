package com.example.be.service.impl;

import com.example.be.DTO.PitchDto;
import com.example.be.DTO.RequestDto;
import com.example.be.model.Pitch;
import com.example.be.model.PitchArea;
import com.example.be.model.PitchType;
import com.example.be.model.RentalTimeFrame;
import com.example.be.repository.IPitchRepository;
import com.example.be.service.IPitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchService implements IPitchService {
    @Autowired
    private IPitchRepository iPitchRepository;

    @Override
    public List<Pitch> getAllPitch() {
        return iPitchRepository.getAll();
    }

    @Override
    public void deletePitch(Integer id) {
        this.iPitchRepository.removePitchById(id);
    }

    @Override
    public void createPitch(PitchDto pitchDto) {
        PitchType type = new PitchType();
        type.setId(pitchDto.getIdType());
        PitchArea area = new PitchArea();
        area.setId(pitchDto.getIdArea());
        RentalTimeFrame time = new RentalTimeFrame();
        time.setId(pitchDto.getIdTime());
        Pitch pitch = new Pitch();
        pitch.setPitchArea(area);
        pitch.setPitchTypes(type);
        pitch.setRentalTimeFrames(time);
        pitch.setAddress(pitchDto.getAddress());
        pitch.setName(pitchDto.getName());
        pitch.setDelete(false);
        this.iPitchRepository.save(pitch);
    }

    @Override
    public void save(Pitch pitch) {
        this.iPitchRepository.save(pitch);
    }

//    @Override
//    public Page<Pitch> findAllPage(RequestDto requestDto) {
//        Pageable pageable = PageRequest.of(requestDto.getPage(), requestDto.getSize());
//        return this.iPitchRepository.findAllPageList(requestDto);
//    }
}
