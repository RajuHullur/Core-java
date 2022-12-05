package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.extendsFiles.Rose;
import com.xworkz.inheritanceassignmentapp.inheritance.Flower;

public class FlowerTester {

	public static void main(String args[]) {
		
		Flower flw = new Flower();
		flw.toGetFragrant("Soap");
		System.out.println("One of product of flower is" + flw.products);
		
		Rose flw1 = new Rose();
		flw1.toGetFragrant("Perfume");
		System.out.println("Rose product is" + flw1.products);
	}

}
