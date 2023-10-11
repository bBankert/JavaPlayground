package com.bbankert.iteration;

import java.text.MessageFormat;

public class ForDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 5;i++) {
			System.out.println("Count: " + i);
		}
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println(MessageFormat.format("I: {0}, J: {1}", i,j));
		}

	}

}
