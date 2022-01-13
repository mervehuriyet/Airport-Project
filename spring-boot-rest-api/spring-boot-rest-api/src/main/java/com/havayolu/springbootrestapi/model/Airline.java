package com.havayolu.springbootrestapi.model;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long airlineCompanyId;
    @Column
    private String airlineCompanyName;

  Airline(){

  }


    public Airline(Long airlineCompanyId, String airlineCompanyName) {
        this.airlineCompanyId = airlineCompanyId;
        this.airlineCompanyName = airlineCompanyName;
    }
}
