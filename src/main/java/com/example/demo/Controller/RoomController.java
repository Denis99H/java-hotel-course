package com.example.demo.Controller;

import com.example.demo.Service.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class RoomController {
    RoomService roomService;

    public RoomController(RoomService roomService) {this.roomService = roomService;}
}
