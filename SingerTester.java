package com.xworkz.inheritanceassignmentapp;

import com.xworkz.inheritanceassignmentapp.inheritance.Singer;

public class SingerTester {
	public static void main(String args[]) {
		
        Singer song = new Singer();
		song.toGetWishes("Coffee nadu chandu");
		System.out.println("Singer is good at " + song.name);
	}
}

