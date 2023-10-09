package com.bbankert.methods;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(1,2);
		printToConsole(String.valueOf(sum));
		printToConsole(sum);
		printToConsole((double)sum);
		
	}
	
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	private static void printToConsole(String text) {
		System.out.println(text);
	}
	
	private static void printToConsole(int num) {
		System.out.println(num);
	}
	
	private static void printToConsole(double val) {
		System.out.println(val);
	}

}
