package com.example.back_end.repository;

import com.example.back_end.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<Room,Integer> {
}
