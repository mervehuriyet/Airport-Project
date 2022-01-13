package com.havayolu.springbootrestapi.controller;


import com.havayolu.springbootrestapi.model.Airport;
import com.havayolu.springbootrestapi.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportRepository repository;
    @PostMapping
    public Airport addAirport(@RequestBody Airport airport){
        return repository.save(airport);

    }
    @GetMapping
    public List<Airport> getAllAirport(){

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Airport> getAirportById(@PathVariable("id") long airportCode) {
        Optional<Airport> airportData = repository.findById(airportCode);

        if (airportData.isPresent()) {
            return new ResponseEntity<>(airportData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}

