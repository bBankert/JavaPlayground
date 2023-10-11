package com.bbankert.methods;

public class VarialbleArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum for all nums " + sumAllNums(1,2,3,4,5,6,7,8,9,10,11,100));
	}
	
	private static int sumAllNums(int ...vals) {
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}

}
