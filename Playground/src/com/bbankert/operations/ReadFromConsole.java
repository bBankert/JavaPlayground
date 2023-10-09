package com.bbankert.operations;

import java.text.MessageFormat;
import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any word: ");
		String word = scanner.next();
		System.out.println("The word entered was: " + word);
		
		System.out.print("Enter a number: ");
		int i = scanner.nextInt();
		System.out.println("The number entered was: " + i);
		
		for(int j = 0; j < args.length; j++) {
			System.out.println(MessageFormat.format("Arg {0}: {1}", j, args[j]));
		}

	}

}
