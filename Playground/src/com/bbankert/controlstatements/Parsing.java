package com.bbankert.controlstatements;

public class Parsing {

	public static void main(String[] args) {
		String input1 = "10e5.4";
		String input2 = "1";

		try {
			// checking valid float using parseInt() method
			Float.parseFloat(input1);
			System.out.println(
				input1 + " is a valid float number");
		}
		catch (NumberFormatException e) {
			System.out.println(
				input1 + " is not a valid float number");
		}

		try {
			// checking valid float using parseInt() method
			Float.parseFloat(input2);
			System.out.println(
				input2 + " is a valid float number");
		}
		catch (NumberFormatException e) {
			System.out.println(
				input2 + " is not a valid float number");
		}

	}

}
