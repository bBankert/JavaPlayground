package com.bbankert.oop.exam.account;

import java.util.Arrays;

public class Account {
	
	private final static int DEFAULT_TRANSACTION_LIMIT = 100;
	private int lastTransactionIndex = 0;
	
	int id;
	
	Transaction[] transactions;
	
	{
		transactions = new Transaction[DEFAULT_TRANSACTION_LIMIT];
	}
	
	public Account(int id) {
		this.id = id;
	}
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
		
		if(accountTo == null) {
			return;
		}
		
		if(moneyAmount <= 0) {
			return;
		}
		
		
		Transaction sendMoneyTransaction = new Transaction(
				this,
				accountTo,
				moneyAmount, 
				StandardAccountOperations.MONEY_TRANSFER_SEND);
		
		
		addTransaction(sendMoneyTransaction);
		
		// set the receive transaction in the destination
		accountTo.receiveMoney(this, moneyAmount);

	}
	
	// the same logic for updating transaction is used everywhere, this can be shared
	private void addTransaction(Transaction transaction) {
		// arrays cannot be expanded so a new one must be created if we reach the limit
		if(lastTransactionIndex == transactions.length - 1) {
			transactions = Arrays.copyOf(transactions, transactions.length + 1);
		}
		
		transactions[lastTransactionIndex] = transaction;
		
		lastTransactionIndex++;
	}
	
	private void receiveMoney(Account accountFrom, double moneyAmount) {
		
		
		
		Transaction receiveMoneyTransaction = new Transaction(
				accountFrom,
				this,
				moneyAmount, 
				StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
		addTransaction(receiveMoneyTransaction);
	}
	
	public void withdrawMoney(double moneyAmount) {
		
		if(moneyAmount <= 0) {
			return;
		}
		
		Transaction withdrawTransaction = new Transaction(
				this,
				this,
				moneyAmount, 
				StandardAccountOperations.WITHDRAW);
		addTransaction(withdrawTransaction);
		
	}
	
	public Transaction[] getTransactions() {
		int nonNullTransactions = 0;
		for(Transaction transaction: transactions) {
			if(transaction != null) {
				nonNullTransactions++;
			}
		}
		
		Transaction[] filteredTransactions = new Transaction[nonNullTransactions];
		int nonNullIndex = 0;
		for(Transaction transaction: transactions) {
			if(transaction != null) {
				filteredTransactions[nonNullIndex] = transaction;
				nonNullIndex++;
			}
		}
		
		return filteredTransactions;
	}
	
	public static class Transaction {
		Account accountFrom;
		Account accountTo;
		double moneyAmount;
		StandardAccountOperations operation;
		
		public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}
		
		public Account getAccountFrom() {
			return this.accountFrom;
		}
		
		public Account getAccountTo() {
			return this.accountTo;
		}
		
		public double getMoneyAmount() {
			return this.moneyAmount;
		}
		
		public StandardAccountOperations getOperation() {
			return this.operation;
		}
		
	}
}
