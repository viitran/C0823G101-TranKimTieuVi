package com.example.back_end.repository.empl;

import com.example.back_end.model.Employee.EmployeeQualifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeQualificationsRepository extends JpaRepository<EmployeeQualifications,Integer> {
}
