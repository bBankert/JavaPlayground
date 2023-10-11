package com.bbankert.Enums;

import java.util.Scanner;

public class MessagePriority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				switch (userInput) {
					case "A":
						System.out.println(TypePriority.A.getPriority());
						break;
					case "B":
						System.out.println(TypePriority.B.getPriority());
						break;
					case "C":
						System.out.println(TypePriority.C.getPriority());
						break;	
					case "D":
						System.out.println(TypePriority.D.getPriority());
						break;
				}
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		switch(userInput.toLowerCase()) {
			case "a":
			case "b":
			case "c":
			case "d":
				return true;
			default:
				return false;
		}
	}

}
