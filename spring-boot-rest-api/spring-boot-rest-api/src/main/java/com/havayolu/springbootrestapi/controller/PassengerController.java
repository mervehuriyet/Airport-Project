package com.havayolu.springbootrestapi.controller;


import com.havayolu.springbootrestapi.model.Passenger;
import com.havayolu.springbootrestapi.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerRepository repository;
    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger){
        return repository.save(passenger);
    }
    @GetMapping
    public List<Passenger> getAllAirport(){
        return repository.findAll();

    }
}
