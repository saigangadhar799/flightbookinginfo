package com.example.flightbookinginfo.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbookinginfo.dto.FlightBookingAcknowlegement;
import com.example.flightbookinginfo.dto.FlightBookingRequest;
import com.example.flightbookinginfo.entity.PassangerInfo;
import com.example.flightbookinginfo.entity.PaymentInfo;
import com.example.flightbookinginfo.repository.PassengerInfoRepository;
import com.example.flightbookinginfo.repository.PaymentInfoRepository;
import com.example.flightbookinginfo.utils.PaymentUtils;

@Service
public class FlightBookingService {
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional
    public FlightBookingAcknowlegement bookFlightTicket(FlightBookingRequest bookingRequest) {
    	
    	PassangerInfo passangerInfo=bookingRequest.getPassangerInfo();
    	passangerInfo=passengerInfoRepository.save(passangerInfo);
    	PaymentInfo paymentInfo=bookingRequest.getPaymentInfo();
    	PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passangerInfo.getFare());
    	paymentInfo.setPassengerId(passangerInfo.getPId());
    	paymentInfo.setAmount(passangerInfo.getFare());
    	paymentInfoRepository.save(paymentInfo);
    	return new FlightBookingAcknowlegement("SUCCESS",passangerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passangerInfo);
    }
}
