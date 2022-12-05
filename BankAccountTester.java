package com.xworkz.bankaccount.app;

import com.xworkz.bankaccount.SavingAccount.SavingAccount;

public class BankAccountTester {
       public static void main(String[] args) {
		
		/*
		 * BankAccount account = new BankAccount(); account.deposit(5000);
		 * System.out.println(account.balence);
		 * System.out.println("My Account balance is"+account.balence);
		 * 
		 * double withDrawAmount = account.withDraw(1000);
		 * 
		 * System.out.println("Thank u for withDrawing "+withDrawAmount);
		 * System.out.println(account.balence);
		 */
		SavingAccount savingAccount=new SavingAccount();
		savingAccount.deposit(100);
	//	savingAccount.transfer(200);
		SavingAccount.periodicInterest();
		System.out.println(SavingAccount.balance);
		
		
	}
}
