package com.bbankert.iteration;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int sum = 0;
		for(int number: arr) {
			sum += number;
			System.out.println("Sum: " + sum);
		}

	}

}
