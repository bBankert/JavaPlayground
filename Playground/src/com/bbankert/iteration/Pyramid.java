package com.bbankert.iteration;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int height = scanner.nextInt();
        
       for(int i = 0; i <= height; i++) {
    	   for(int j = 0; j < i; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
       for(int i = height - 1; i > 0; i--) {
    	   for(int j = 0; j < i; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }

	}

}
