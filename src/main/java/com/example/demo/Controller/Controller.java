package com.example.demo.Controller;

import com.example.demo.Model.Hotel;
import com.example.demo.Service.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()



public class Controller {
    @Autowired
    HotelService hotelService;

    @GetMapping()

    public List<Hotel> findAllHotels() {
        return hotelService.findAllHotels();
    }

    @GetMapping ("/{id}")
    public Hotel findById(@PathVariable("id") Long id) {
        return hotelService.findById(new Long("id"));
    }

    @PostMapping()
    public String createHotel(@RequestBody Hotel hotel){
        return hotelService.createHotel(hotel);
    }

    @GetMapping("/rating-greater-then/{rating}")
    public List<Hotel> findAllGreaterThan(@PathVariable("rating") Integer rating){
        return hotelService.findAllByRatingGreaterThan(rating);
    }



}

