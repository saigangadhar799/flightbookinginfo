package com.example.flightbookinginfo.exception;

public class InsufficientAmountException extends RuntimeException{
	
	public InsufficientAmountException(String msg) {
		super(msg);
	}

}
