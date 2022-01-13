package com.havayolu.springbootrestapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private Long passengerId;
    private String passengerName;
    private String passengerSurname;
    private int cartNumber;

    Passenger(){}

    public Passenger(Long passengerId,String passengerName, String passengerSurname, int cartNumber) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.cartNumber =cartNumber;

    }
}
