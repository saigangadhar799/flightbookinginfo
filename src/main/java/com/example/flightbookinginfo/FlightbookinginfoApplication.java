package com.example.flightbookinginfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbookinginfo.dto.FlightBookingAcknowlegement;
import com.example.flightbookinginfo.dto.FlightBookingRequest;
import com.example.flightbookinginfo.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightbookinginfoApplication {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowlegement bookFlightTicket(@RequestBody FlightBookingRequest bookingRequest) {
		return flightBookingService.bookFlightTicket(bookingRequest);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightbookinginfoApplication.class, args);
	}

}
