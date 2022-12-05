package com.xworkz.narrowing.castingapp;

public class Narrowing {
	public static void main(String[] args) {
		double d = 220.22;
		// converting double data type into long data type;
		long l = (long) d;
		// //converting long data type into int data type;
		int i = (int) l;

		System.out.println("Before conversion :" + d);
		System.out.println("After conversion into long type :" + l);
		System.out.println("After conversion into int type :" + i);
	}
}
