package com.example.back_end.service.impl.empl;

import com.example.back_end.model.Employee.EmployeeQualifications;
import com.example.back_end.repository.empl.IEmployeeQualificationsRepository;
import com.example.back_end.service.IEmployeeQualificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeQualificationsService implements IEmployeeQualificationsService {
    @Autowired
    private IEmployeeQualificationsRepository iEmployeeQualificationsRepository;

    @Override
    public List<EmployeeQualifications> findAll() {
        return iEmployeeQualificationsRepository.findAll();
    }

    @Override
    public void save(EmployeeQualifications employeeQualifications) {
        iEmployeeQualificationsRepository.save(employeeQualifications);
    }

    @Override
    public Optional<EmployeeQualifications> findById(Integer id) {
        return iEmployeeQualificationsRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iEmployeeQualificationsRepository.deleteById(id);
    }
}
