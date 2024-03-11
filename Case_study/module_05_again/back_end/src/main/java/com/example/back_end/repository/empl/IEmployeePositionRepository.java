package com.example.back_end.repository.empl;

import com.example.back_end.model.Employee.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePositionRepository extends JpaRepository<EmployeePosition,Integer> {
}
