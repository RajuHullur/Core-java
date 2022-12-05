package com.xworkz.bankaccount.CurrentAccount;

import com.xworkz.bankaccount.app.BankAccount;

public class CurrentAccount  extends BankAccount{

		
		public static void main(String[] args) {
			
		CurrentAccount currentAccount= new CurrentAccount();
		currentAccount.deposit(4000);
		currentAccount.withDraw(1000);
		System.out.println("My current Account Bank Balence is"+currentAccount);
		
		CurrentAccount annaCurrentAccount= new CurrentAccount();
		 annaCurrentAccount.deposit(4000);
		annaCurrentAccount.withDraw(1000);
		System.out.println("My current Account Bank Balence is"+annaCurrentAccount);
		
		CurrentAccount  sisCurrentAccount= new CurrentAccount();
		sisCurrentAccount.deposit(4000);
		sisCurrentAccount.withDraw(1000);
		System.out.println("My current Account Bank Balence is"+sisCurrentAccount);
		
		
		}
}
