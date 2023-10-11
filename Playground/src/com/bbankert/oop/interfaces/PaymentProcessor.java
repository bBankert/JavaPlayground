package com.bbankert.oop.interfaces;

public interface PaymentProcessor {
	
	// equivalent to public static final int RETRY_ATTEMPTS
	int RETRY_ATTEPMPTS = 5;
	
	void processPayment(PaymentData payment);
	
	default void someDefaultMethod() {
		System.out.println("This is the default method");
	}
	
	static void someStaticMethod() {
		System.out.println("This is the static method");
	}

}
