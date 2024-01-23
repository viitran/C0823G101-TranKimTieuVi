package com.example.thuc_hanh.repository;

import com.example.thuc_hanh.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Integer> {
}
