package com.havayolu.springbootrestapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Route {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long routeId;

    @Column
    private String source;

    @Column
    private String destination;

    Route(){

    }
    public Route(Long routeId, String source, String destination){
        this.routeId=routeId;
        this.source=source;
        this.destination=destination;
    }
}
