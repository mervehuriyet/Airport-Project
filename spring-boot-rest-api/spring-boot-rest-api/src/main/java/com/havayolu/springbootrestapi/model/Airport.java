package com.havayolu.springbootrestapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name ="/airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long airportCode;
    @Column
    private String airportLocation;
    @Column
    private String airportName;

    Airport() {
    }

    public Airport(Long airportCode, String airportLocation, String airportName) {
        this.airportName = airportName;
        this.airportLocation = airportLocation;
        this.airportCode = airportCode;
    }
}



