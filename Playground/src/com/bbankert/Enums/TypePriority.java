package com.bbankert.Enums;

public enum TypePriority {
	A(1), B(2), C(3), D(3);
	
	private int priority;
	
	
	
	private TypePriority(int priority) {
		this.priority = priority;
	}
	
	public String getPriority() {
		switch(this.priority) {
			case 1:
				return "HIGH";
			case 2:
				return "MEDIUM";
			case 3:
				return "LOW";
			default:
				return "";
		}
	}
}
