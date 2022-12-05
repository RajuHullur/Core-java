package com.xworkz.bankaccount.SavingAccount;

import com.xworkz.bankaccount.app.BankAccount;

public class SavingAccount  extends BankAccount {

	public double interestRate;
	public SavingAccount() {
		
		// TODO Auto-generated constructor stub
	}
	 SavingAccount(String interestRate) {
	
		this.interestRate = interestRate;
	}

	/*
	 * public static void main(String []arcs) { SavingAccount savingAccount= new
	 * SavingAccount(); savingAccount.deposit(3000); savingAccount.withDraw(300);
	 * 
	 * System.out.println("My Savings Account  Balance is "+savingAccount);
	 * 
	 * SavingAccount brotherSavingAccount= new SavingAccount(); {
	 * savingAccount.deposit(2000); savingAccount.withDraw(600); }
	 * brotherSavingAccount.transfer(3000.00,savingAccount);
	 * System.out.println("My Saving account Balance is"+savingAccount);
	 * System.out.println("My brother account Balance is"+savingAccount);
	 * 
	 * }
	 */
	

		//SavingAccount Specific method
		public  void periodicInterest() {
			double newBalance = newBalance * interestRate / 100;
			deposit(newBalance);
		}
	}
	
