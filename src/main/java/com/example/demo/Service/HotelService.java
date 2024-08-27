package com.example.demo.Service;

import com.example.demo.Model.Hotel;
import com.example.demo.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor


public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public List<Hotel> findAllByRatingGreaterThan(Integer rating){
        return hotelRepository.findAllByRatingGreaterThan(rating);
    }

    public List<Hotel> findAllHotels() {
        return hotelRepository.findAll();
    }


    public String createHotel(Hotel hotel) {
        hotelRepository.save(hotel);

        return "Hotel is saved";
    }

    public Hotel findById(Long id){
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);

        return optionalHotel.get();
    }
}



