package com.example.back_end.controller;

import com.example.back_end.model.Employee.EmployeePosition;
import com.example.back_end.model.Employee.EmployeeQualifications;
import com.example.back_end.model.Employee.EmployeeWorkingParts;
import com.example.back_end.repository.empl.IEmployeePositionRepository;
import com.example.back_end.repository.empl.IEmployeeQualificationsRepository;
import com.example.back_end.repository.empl.IEmployeeWorkingPartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private IEmployeeWorkingPartsRepository iEmployeeWorkingPartsRepository;
    @Autowired
    private IEmployeePositionRepository iEmployeePositionRepository;
    @Autowired
    private IEmployeeQualificationsRepository iEmployeeQualificationsRepository;


    @GetMapping("/working-parts")
    public ResponseEntity<List<EmployeeWorkingParts>> findAllWorkingParts() {
        return new ResponseEntity<>(this.iEmployeeWorkingPartsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/position")
    public ResponseEntity<List<EmployeePosition>> findAllPosition() {
        return new ResponseEntity<>(this.iEmployeePositionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/qualifications")
    public ResponseEntity<List<EmployeeQualifications>> findAllQualifications() {
        return new ResponseEntity<>(this.iEmployeeQualificationsRepository.findAll(), HttpStatus.OK);
    }
}
