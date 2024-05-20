package com.example.be.controller;

import com.example.be.service.IPitchAreaService;
import com.example.be.service.IPitchTypeService;
import com.example.be.service.IRentalTimeFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PitchAreaController {
    @Autowired
    private IPitchAreaService iPitchAreaService;
    @Autowired
    private IPitchTypeService iPitchTypeService;
    @Autowired
    private IRentalTimeFrameService iRentalTimeFrameService;
    @GetMapping("/pitch-area")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(this.iPitchAreaService.findAllArea(),HttpStatus.OK);
    }

    @GetMapping("/pitch-type")
    public ResponseEntity<?> getAllType(){
        return new ResponseEntity<>(this.iPitchTypeService.findAllType(),HttpStatus.OK);
    }
    @GetMapping("/time")
    public ResponseEntity<?> getAllTime(){
        return new ResponseEntity<>(this.iRentalTimeFrameService.findAll(),HttpStatus.OK);
    }
}
