package com.havayolu.springbootrestapi.repository;


import com.havayolu.springbootrestapi.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;


@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>{}
