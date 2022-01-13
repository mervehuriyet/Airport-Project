package com.havayolu.springbootrestapi.controller;



import com.havayolu.springbootrestapi.model.Airport;
import com.havayolu.springbootrestapi.model.Route;
import com.havayolu.springbootrestapi.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteRepository repository;

    @PostMapping
    public Route addRoute(@RequestBody Route route) {
        return repository.save(route);
    }

    @GetMapping
    public List<Route> getAllRoute() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable("id") long routeId) {
        Optional<Route> routeData = repository.findById(routeId);

        if (routeData.isPresent()) {
            return new ResponseEntity<>(routeData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}