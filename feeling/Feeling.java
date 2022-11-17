package com.assingment.feeling;

public class Feeling {
	public String name;
	public int price;

	public void fName(String name) {
		System.out.println("The name is:" +name);
		this.name = name;
	}

	public void fPrice(int price) {
		System.out.println("The price is:" +price);
		this.price = price;
	}
}
