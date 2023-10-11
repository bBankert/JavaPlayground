package com.bbankert.oop.classes.classtypes;

public class MasterProduct extends Product {
	
	private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}

}
