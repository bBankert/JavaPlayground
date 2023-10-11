package com.bbankert.math;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Please, enter A side of a triangle: ");
		int sideA = scanner.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int sideB = scanner.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int sideC = scanner.nextInt();
		
		double p = (sideA + sideB + sideC) / 2;
		
		double triangleArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
		System.out.println("Triangle area is: " + (triangleArea == 0.0 ? "NaN" : triangleArea));
		

	}

}
