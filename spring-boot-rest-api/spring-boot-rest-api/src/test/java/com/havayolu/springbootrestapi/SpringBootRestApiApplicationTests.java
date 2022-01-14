package com.havayolu.springbootrestapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRestApiApplicationTests {

package com.havayolu.springbootrestapi;

import com.havayolu.springbootrestapi.model.Airline;
import com.havayolu.springbootrestapi.model.Airport;
import com.havayolu.springbootrestapi.repository.AirlineRepository;
import com.havayolu.springbootrestapi.repository.AirportRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringBootRestApiApplicationTests {

	@Autowired
	AirportRepository airportRepository;

	@Autowired
	AirlineRepository airlineRepository;

	@Test
	public void testCreate(){

        Airport a = new Airport();
		a.setAirportCode(1L);
		a.setAirportName("hatay havalimanı");
		a.setAirportLocation("hatay");;
		airportRepository.save(a);
		assertNotNull(airportRepository.findById(1L).get());

	}

	@Test
	public void AirlinetestCreate(){

		Airline air = new Airline();
		air.setAirlineCompanyId(1L);
		air.setAirlineCompanyName("pegasus");

		airlineRepository.save(air);
		assertNotNull(airlineRepository.findById(1L).get());

	}
	@Test
	public void testAirportlocation (){
		Airport airport = airportRepository.findById(1L).get();
		assertEquals("hatay",airport.getAirportLocation());

	}



}


