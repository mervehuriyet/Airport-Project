package com.havayolu.springbootrestapi.controller;

import com.havayolu.springbootrestapi.model.Airline;
import com.havayolu.springbootrestapi.model.Airport;
import com.havayolu.springbootrestapi.repository.AirlineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineRepository repository;
    @PostMapping
    public Airline addAirport(@RequestBody Airline airline){
        return repository.save(airline);

    }
    @GetMapping
    public List<Airline> getAllAirline(){

        return repository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Airline> getAirlineById(@PathVariable("id") long airlineCompanyId) {
        Optional<Airline> airlineData = repository.findById(airlineCompanyId);

        if (airlineData.isPresent()) {
            return new ResponseEntity<>(airlineData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}