package com.bespoke.bitcoin.bootifulcalculator.exceptions;

public class OperatorNotFoundException extends CalculatorException {
    private static final long serialVersionUID = 2648454774540904330L;
    private static String message = "Operator cannot be found. Type should be one of the following: add, sub, mul, div";

	public OperatorNotFoundException() {
		super(message);
	}
	
	public OperatorNotFoundException(String operator) {
		super(message + ". Operator value: " + operator);
	}
	
	public OperatorNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public OperatorNotFoundException(Throwable cause) {
		super(message, cause);
	}
}
