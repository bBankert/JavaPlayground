package com.bbankert.iteration;

public class Labels {
	public static void main(String[] args) {
		loop1: for(int i = 0; i < 5; i++) {
			System.out.println("counter i"+ i);
			loop2: for(int j = 0; j < 5; j++) {
				System.out.println("counter j" + j);
				
				if(j >= 0 && j < 3) {
					System.out.println("continue loop 2");
					continue loop2;
				}
				else {
					System.out.println("break main loop");
					break loop1;
				}
			}
		}
	}
}
