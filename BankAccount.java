package com.xworkz.bankaccount.app;

public class BankAccount {
	
	//iscCode,branchName, accountNo, balance
	String ifscCode;
	String branchName;
	String accountNo;
	double balence;
	  
	public double withDraw(double balence){
		 this.balence = this.balence-balence;
	   return this.balence;
	}
	//balence 5000;
	public double deposit(double balence)
	{
		//0.0+5000;
		this.balence = this.balence+balence;
		return this.balence;
	} 
	public  void transfer(double amount, BankAccount friendsAccount) {
		System.out.println("Transfering To Frinds  Account");
		withDraw(amount);
		friendsAccount.deposit(amount);
		System.out.println("Transfering Done... Transaction Successfull");
	}
}

