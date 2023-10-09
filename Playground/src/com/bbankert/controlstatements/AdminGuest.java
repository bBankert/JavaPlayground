package com.bbankert.controlstatements;

public class AdminGuest {

	public static void main(String[] args) {
		String joinedArgs = String.join(",", args);
		if(joinedArgs.contains("admin") && joinedArgs.contains("guest")) {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}
		else if(joinedArgs.contains("admin"))
		{
			System.out.println("Hello, Admin!");
		}
		else if(joinedArgs.contains("guest"))
		{
			System.out.println("Hello, Guest!");
		}

	}

}
