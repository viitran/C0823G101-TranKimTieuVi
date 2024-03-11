package com.example.back_end.service.impl;

import com.example.back_end.model.Room;
import com.example.back_end.repository.IRoomRepository;
import com.example.back_end.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private IRoomRepository iRoomRepository;

    @Override
    public List<Room> findAll() {
        return iRoomRepository.findAll();
    }

    @Override
    public void save(Room room) {
        iRoomRepository.save(room);
    }

    @Override
    public Optional<Room> findById(Integer id) {
        return iRoomRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iRoomRepository.deleteById(id);
    }
}
