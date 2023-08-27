package com.example.flightbookinginfo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.flightbookinginfo.exception.InsufficientAmountException;

public class PaymentUtils {
	
	private static Map<String, Double> paymentMap=new HashMap<String, Double>();
	static{
		paymentMap.put("acc1", 20000.0);
		paymentMap.put("acc2", 10000.0);
		paymentMap.put("acc3", 5000.0);
		paymentMap.put("acc4", 8000.0);
		
	}
	
	public static boolean validateCreditLimit(String accNo,double paidAmount) {
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsufficientAmountException("Insufficient Fund...!");
		}else {
			return true;
		}
		
		
	}

}
