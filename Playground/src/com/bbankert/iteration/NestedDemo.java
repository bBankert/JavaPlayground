package com.bbankert.iteration;

public class NestedDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
			for(int j = 0; j < 3; j++) {
				System.out.println("j: " + j);
			}
		}

	}

}
