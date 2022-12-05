package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.inheritance.Organ;

public class OrganTester {

public static void main(String args[]) {
		
        Organ org = new Organ();
		org.toSense("Tongue");
		System.out.println(" To taste there is sense organ called "  + org.organName);
	}

}
