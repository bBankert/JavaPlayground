package com.bbankert.oop.exam.presents;

import java.util.Arrays;

public class Present {
	
	private Sweet[] sweets;
	private int currentSweetIndex = 0;
	
	{
		sweets = new Sweet[10];
	}
	
	public void addSweet(Sweet sweet) {
		if(currentSweetIndex == sweets.length - 1) {
			Arrays.copyOf(sweets, sweets.length + 1);
		}
		sweets[currentSweetIndex] = sweet;
		currentSweetIndex++;
	}

	public double calculateTotalWeight() {
		double totalWeight = 0;
		for(Sweet sweet: sweets) {
			
			if(sweet == null) {
	    		continue;
	    	}
			
			totalWeight += sweet.getWeight();
		}
		
		return totalWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
		
		int filteredSweetLength = 0;
		
	    for(Sweet sweet: sweets) {
	    	if(sweet == null) {
	    		continue;
	    	}
	    	if(sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
	    		filteredSweetLength++;
	    	}
	    }
	    
	    Sweet[] filteredSweets = new Sweet[filteredSweetLength];
	    int currentFilteredSweetIndex = 0;
	    for(Sweet sweet: sweets) {
	    	if(sweet == null) {
	    		continue;
	    	}
	    	
	    	if(sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
	    		filteredSweets[currentFilteredSweetIndex] = sweet;
	    		currentFilteredSweetIndex++;
	    	}
	    }
	    return filteredSweets;
	}

	public Sweet[] getSweets() {
		int filteredSweetLength = 0;
		
	    for(Sweet sweet: sweets) {
	    	if(sweet != null) {
	    		filteredSweetLength++;
	    	}
	    }
	    
	    Sweet[] filteredSweets = new Sweet[filteredSweetLength];
	    int currentFilteredSweetIndex = 0;
	    for(Sweet sweet: sweets) {
	    	if(sweet != null) {
	    		filteredSweets[currentFilteredSweetIndex] = sweet;
	    		currentFilteredSweetIndex++;
	    	}
	    }
	    return filteredSweets;
	}
}
