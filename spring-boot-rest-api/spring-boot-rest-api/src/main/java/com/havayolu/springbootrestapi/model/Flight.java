package com.havayolu.springbootrestapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Flight {
    @Id
    private Long flightId;
    private String airlineCompany;
    private int totalCapacity;
    private String route;
    private String arrivalAirport;
    private String departureAirport;
    private int ticketPrice;
    private int remainingCapacity;

    Flight(){

    }

    public Flight(Long flightId, String airlineCompany, int totalCapacity, String route, String arrivalAirport, String departureAirport, int ticketPrice, int remainingCapacity) {
        this.flightId = flightId;
        this.airlineCompany = airlineCompany;
        this.totalCapacity = totalCapacity;
        this.route = route;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.ticketPrice = ticketPrice;
        this.remainingCapacity = remainingCapacity;
    }
}
