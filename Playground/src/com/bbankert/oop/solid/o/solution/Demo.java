package com.bbankert.oop.solid.o.solution;

import com.bbankert.oop.solid.s.shared.User;

public class Demo {
	public static void main(String[] args) {
		LoanHandler loanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
		User user = new User();
		
		loanHandler.approveLoan(user);
		
		LoanHandler loanHandler2 = new MortgageLoanHandler(new MortgageLoanValidator());
		loanHandler2.approveLoan(user);
	}
}
