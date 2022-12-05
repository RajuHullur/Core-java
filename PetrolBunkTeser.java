package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.inheritance.PetrolBunk;

public class PetrolBunkTeser {

	
	public static void main(String args[]) {
		
		PetrolBunk petr = new PetrolBunk();
		petr.toGetFuels(89.4);
		System.out.println("Petrol price is" + petr.price);
		
		HP petr1 = new HP();
		petr1.toGetFuels(95.2);
		System.out.println("Hp petrol bunk orice is" + petr1.price);
	}

}