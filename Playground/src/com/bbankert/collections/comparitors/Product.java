package com.bbankert.collections.comparitors;

public interface Product {

	int getId();

	String getProductName();
	
	String getCategoryName();
	
	double getPrice();

	void setPrice(double price);
}