package com.bbankert.math;

import java.util.Scanner;
import java.lang.Math;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a circle radius: ");
		int radius = scanner.nextInt();
		
		double circleCircumference = 2 * Math.PI * radius;
		
		System.out.println("Circle circumference is: " + circleCircumference);

	}

}
