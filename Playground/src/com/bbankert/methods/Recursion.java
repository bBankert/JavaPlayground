package com.bbankert.methods;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fib" + fib(5));
	}
	
	private static int fib(int num) {
		if(num == 0) {
			return 0;
		}
		else if(num == 1) {
			return 1;
		}
		else {
			return fib(num - 1) + fib(num - 2);
		}
		
	}

}
