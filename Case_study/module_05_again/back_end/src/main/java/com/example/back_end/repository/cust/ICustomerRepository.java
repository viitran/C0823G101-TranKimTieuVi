package com.example.back_end.repository.cust;

import com.example.back_end.model.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select * from khach_hang where khach_hang.is_delete = 0", nativeQuery = true)
    List<Customer> findAllCus();

    @Modifying
    @Transactional
    @Query(value = "update khach_hang kh set kh.is_delete = 1 where kh.id = :id ", nativeQuery = true)
    void removeCustomerById(@Param("id") int id);

    @Query(value = "select * from khach_hang where khach_hang.id=:id",nativeQuery = true)
    Customer findIdCustomer(@Param("id")int id);
}
