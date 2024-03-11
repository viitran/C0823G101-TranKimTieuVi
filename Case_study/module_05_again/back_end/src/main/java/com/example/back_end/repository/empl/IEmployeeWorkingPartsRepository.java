package com.example.back_end.repository.empl;

import com.example.back_end.model.Employee.EmployeeWorkingParts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeWorkingPartsRepository extends JpaRepository<EmployeeWorkingParts,Integer> {
}
