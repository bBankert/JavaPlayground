package com.bbankert.collections.comparitors;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

	// sort by category name
	// if category name is the same, sort by price asc
	// if price is the same, sort by product name
	@Override
	public int compare(Product product1, Product product2) {
		int categoryComparison = product1.getCategoryName().compareTo(product2.getCategoryName());
		
		if(categoryComparison != 0) {
			return categoryComparison;
		}
		
		boolean equalPrice = product1.getPrice() == product2.getPrice();
		
		if(!equalPrice) {
			
			return product1.getPrice() > product2.getPrice() ? -1 : 1;
		}
		
		return product1.getProductName().compareTo(product2.getProductName());
		
	}

}