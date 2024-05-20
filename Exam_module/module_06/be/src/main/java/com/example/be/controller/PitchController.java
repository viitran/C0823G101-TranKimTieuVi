package com.example.be.controller;

import com.example.be.DTO.PitchDto;
import com.example.be.model.Pitch;
import com.example.be.service.IPitchAreaService;
import com.example.be.service.IPitchService;
import com.example.be.service.IPitchTypeService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PitchController {
    @Autowired
    private IPitchService iPitchService;

    @GetMapping
    public ResponseEntity<?> showAllPitch() {
        return new ResponseEntity<>(this.iPitchService.getAllPitch(), HttpStatus.OK);
    }

    @PostMapping("/create-pitch")
    public ResponseEntity<?> createPitch(@Valid @RequestBody Pitch pitch, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
//        this.iPitchService.createPitch(pitch);
//        BeanUtils.copyProperties(pitchDto,pitch);
        this.iPitchService.save(pitch);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<?> removePitch(@PathVariable Integer id) {
        this.iPitchService.deletePitch(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
