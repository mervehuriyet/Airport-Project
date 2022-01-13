package com.havayolu.springbootrestapi.repository;

import com.havayolu.springbootrestapi.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline,Long> {
}
