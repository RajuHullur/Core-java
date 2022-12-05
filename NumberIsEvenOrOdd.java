package com.xworkz.numberisevenorodd;

public class NumberIsEvenOrOdd{
	
public static void main(String args[]) {
	 int x;
	 NumberIsEvenOrOdd  nm = new NumberIsEvenOrOdd();
	 
	 System.out.print("Enter an integer");
	 
	 x = nm.next();
	 if(x%2==0)
	 {
	 	 System.out.println("Number is even");
	 }
	 else
	 {
		 System.out.println("Number is odd");
	 }	 
}
}
