package com.bbankert.methods;

public class StringProcessor {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
		
		public static String convert1(String input) {
			String output = "";
			String[] splitData = input.split(System.lineSeparator());
			for(int i = 0; i < splitData.length; i++) {
				//ignore "header" line
				if(i == 0) {
					continue;
				}
				String[] personData = splitData[i].split(";");
				output += personData[0] + " ==> " + personData[2] + System.lineSeparator();
			}
			
			return output;
		
		}
		
		
		public static String convert2(String input) {
			String output = "";
			String[] splitData = input.split(System.lineSeparator());
			for(int i = 0; i < splitData.length; i++) {
				//ignore "header" line
				if(i == 0) {
					continue;
				}
				String[] personData = splitData[i].split(";");
				output += personData[1] + " (email: " + personData[2] + ")" + System.lineSeparator();
			}
			
			return output;
		
		}

}
