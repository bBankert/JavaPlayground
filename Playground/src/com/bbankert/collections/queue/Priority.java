package com.bbankert.collections.queue;

public enum Priority {
	LOW(1), MEDIUM(2), HIGH(3);
	
	private int value;
	
	private Priority(int value) {
		this.value = value;
	}
	
	public int getPriorityValue() {
		return this.value;
	}

}
