package com.bbankert.iteration;

public class JumpStatements {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("counter: " + i);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					break;
				}
				
				System.out.println("j: " + j);
			}
		}
		
		
		
		

	}

}
