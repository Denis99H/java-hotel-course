package com.example.demo.Service;

import com.example.demo.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor


public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
}
