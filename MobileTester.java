package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.extendsFiles.Oppo;
import com.xworkz.inheritanceassignmentapp.inheritance.Mobile;

public class MobileTester {


	
	public static void main(String args[]) {
		
		Mobile mb = new Mobile();
		mb.toMakeCalls(80000);
		System.out.println("Maximum price of mobile is" + mb.price);
		
		Oppo mb1 = new Oppo();
		mb1.toMakeCalls(12000);
		System.out.println("Price of oppo mobile is" + mb1.price);
		
		
}
