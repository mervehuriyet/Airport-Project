package com.havayolu.springbootrestapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketId;
    private int price;
    private int passengerId;
    private int flightId;

    Reservation(){

    }
    Reservation(Long ticketId, int price, int passengerId, int flightId){
        this.ticketId = ticketId;
        this.price = price;
        this.passengerId = passengerId;
        this.flightId = flightId;
    }
}
