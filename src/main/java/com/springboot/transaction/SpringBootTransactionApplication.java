package com.springboot.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.transaction.dto.FlightBookingAcknowledgement;
import com.springboot.transaction.dto.FlightBookingRequest;
import com.springboot.transaction.service.FlightBookingService;

@RestController
@SpringBootApplication
@EnableTransactionManagement
public class SpringBootTransactionApplication {

	@Autowired
	private FlightBookingService service;
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		
		return service.bookFlightTicket(request);
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTransactionApplication.class, args);
	}

}
