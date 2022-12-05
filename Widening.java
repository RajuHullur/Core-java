package com.xworkz.narrowing.castingapp;

public class Widening {
 public static void main(String[] args) {
	int i=7;
	//conversion into integer data type into long data type
	long l=i;
	//conversion into long  data type into float data type
	float f=l;
	System.out.println("Before conversion int value :"+i);
	System.out.println("After conversion long value :"+l);
	System.out.println("After conversion float value :"+f);
}
}
