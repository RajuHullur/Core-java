package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.extendsFiles.Asia;
import com.xworkz.inheritanceassignmentapp.inheritance.Continent;

public class ContinentTester {

	public static void main(String args[]) {
		
		Continent cont = new Continent();
		cont.toLeave(100);
		System.out.println("Total number of countries" +cont.noOfCountries);
		
		Asia cont1 = new Asia();
		cont1.toLeave(45);
		System.out.println("number of countries in Asia" +cont1.noOfCountries);
	}

}

