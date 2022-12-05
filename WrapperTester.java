package com.xworkz.hospitalapp;

public class WrapperTester {
	public static void main(String[] args) {
		
		int age= 23;
		//Boxing
		Integer age1=age;
		// un-boxing 
		int age2=age1;
		
		long mobileNo=8197906086l;
		Long mobileNo1=mobileNo;
		long mobileNo2=mobileNo1;
		
		double price=220000;
		Double price1=price;
		double price2=price1;
		
		float rate=22.0f;
		Float rate1=rate;
		float rate2=rate1;
		
		char slNo ='1';
		Character slNo1=slNo;
		char slNo2=slNo1;
		
		
		System.out.println("The age is:"+age);
		System.out.println("The Age is:"+age1);
		System.out.println("The mobileNo is :"+mobileNo);
		System.out.println("The mobileNo is :"+mobileNo1);
		System.out.println("The price is:"+price);
		System.out.println("The Price is:"+price1);
		System.out.println("The rate is :"+rate);
		System.out.println("The Rate is :"+rate1);
		System.out.println("The slNo is :"+slNo);
		System.out.println("The SlNo is :"+slNo1);

	}
}
