package com.assingment.vegitable;

public class Vegitable {
 
	public String name;
	public String items;
	public int price;
	public String vitamins;
	
	public void  name() {
		System.out.println("The vegitable name is"+name);
	}
	
	public void items() {
		System.out.println("The items of  vegitable is"+items);
	}
	
	public  void  price() {
		System.out.println("The  price of vegitable is"+price);
	}
	
	public void vitamins() {
		System.out.println("The  vitamins of vegitable is"+vitamins);
	}
	
	public void displayInfo() {
		System.out.println("The name of  vegitable is"+name);
		System.out.println("The items of  vegitable is"+items);
		System.out.println("The price of vegitable is "+price);
		System.out.println("The vitamins of vegitable is"+vitamins);
	}
}
