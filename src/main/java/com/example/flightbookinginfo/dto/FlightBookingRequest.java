package com.example.flightbookinginfo.dto;

import com.example.flightbookinginfo.entity.PassangerInfo;
import com.example.flightbookinginfo.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
	
	private PassangerInfo passangerInfo;
	private PaymentInfo paymentInfo;

}
