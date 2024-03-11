package com.example.back_end.repository.empl;

import com.example.back_end.model.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(nativeQuery = true, value = "select * from nhan_vien where nhan_vien.id = :id")
    Employee findIdEmployee(@Param("id") int id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "update nhan_vien nv set nv.is_delete = 1 where nv.id = :id ")
    void removeById(@Param("id") int id);

    @Query(nativeQuery = true,value = "select  * from nhan_vien where nhan_vien.is_delete = 0")
    List<Employee> findAllEmp();
}
