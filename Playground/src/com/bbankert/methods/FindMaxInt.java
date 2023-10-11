package com.bbankert.methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMaxInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		
		int[] numArray = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			numArray[i] = Integer.parseInt(arr[i]);
		}
		    			
	    int maxInt = findMaxIntInArray(numArray);
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(numArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max = 0;
		for(int i = 0; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		return max;
	}

}
