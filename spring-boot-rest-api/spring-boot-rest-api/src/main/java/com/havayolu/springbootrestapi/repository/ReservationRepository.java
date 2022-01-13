package com.havayolu.springbootrestapi.repository;

import com.havayolu.springbootrestapi.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface ReservationRepository
        extends JpaRepository<Reservation,Long> {

}


