package com.example.back_end.service.impl.empl;

import com.example.back_end.model.Employee.EmployeePosition;
import com.example.back_end.repository.empl.IEmployeePositionRepository;
import com.example.back_end.service.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeePositionService implements IEmployeePositionService {
    @Autowired
    private IEmployeePositionRepository iEmployeePositionRepository;
    @Override
    public List<EmployeePosition> findAll() {
        return iEmployeePositionRepository.findAll();
    }

    @Override
    public void save(EmployeePosition employeePosition) {
        iEmployeePositionRepository.save(employeePosition);
    }

    @Override
    public Optional<EmployeePosition> findById(Integer id) {
        return iEmployeePositionRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iEmployeePositionRepository.deleteById(id);
    }
}
