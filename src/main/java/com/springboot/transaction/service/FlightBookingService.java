package com.springboot.transaction.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.transaction.dto.FlightBookingAcknowledgement;
import com.springboot.transaction.dto.FlightBookingRequest;
import com.springboot.transaction.entity.PassengerInfo;
import com.springboot.transaction.entity.PaymentInfo;
import com.springboot.transaction.repo.PaymentInfoRepository;
import com.springboot.transaction.repo.passengerInfoRepository;
import com.springboot.transaction.utils.Paymentutils;

public class FlightBookingService {

	
	@Autowired
	private passengerInfoRepository passengerinforepository;
	
	@Autowired
	private PaymentInfoRepository paymentInforepository;
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest reques) {
		
		
		
		PassengerInfo passengerInfo=reques.getPassengerInfo();
		
		passengerinforepository.save(passengerInfo);
		
		PaymentInfo paymentInfo=reques.getPaymentInfo();
		
		Paymentutils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFace());
		
		
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFace());
		
		paymentInforepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFace(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}
}
