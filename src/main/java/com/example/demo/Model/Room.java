package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Room")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long id;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "max_guests")
    private Integer maxGuests;

}
