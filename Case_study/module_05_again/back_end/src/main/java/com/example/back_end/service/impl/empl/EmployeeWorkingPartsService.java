package com.example.back_end.service.impl.empl;

import com.example.back_end.model.Employee.EmployeeWorkingParts;
import com.example.back_end.repository.empl.IEmployeeWorkingPartsRepository;
import com.example.back_end.service.IEmployeeWorkingPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeWorkingPartsService implements IEmployeeWorkingPartsService {
    @Autowired
    private IEmployeeWorkingPartsRepository iEmployeeWorkingPartsRepository;
    @Override
    public List<EmployeeWorkingParts> findAll() {
        return iEmployeeWorkingPartsRepository.findAll();
    }

    @Override
    public void save(EmployeeWorkingParts employeeWorkingParts) {
        iEmployeeWorkingPartsRepository.save(employeeWorkingParts);
    }

    @Override
    public Optional<EmployeeWorkingParts> findById(Integer id) {
        return iEmployeeWorkingPartsRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iEmployeeWorkingPartsRepository.deleteById(id);
    }
}
