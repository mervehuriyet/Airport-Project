package com.havayolu.springbootrestapi.repository;

import com.havayolu.springbootrestapi.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route,Long> {
}
