package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "numberOfStars")
    private Integer numberOfStars;


    @Column(name = "country")
    private String country;


    @Column(name = "city")
    private String city;
}
