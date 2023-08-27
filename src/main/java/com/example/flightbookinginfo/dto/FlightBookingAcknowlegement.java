package com.example.flightbookinginfo.dto;

import com.example.flightbookinginfo.entity.PassangerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowlegement {

	
	private String status;
	private double totalFare;
	private String pnrNo;
	private PassangerInfo passangerInfo;
}
