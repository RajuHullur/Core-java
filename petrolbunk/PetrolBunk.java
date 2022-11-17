package com.assingment.petrolbunk;

public class PetrolBunk {
	public String name;
	public int price;

	public void brandName(String name) {
		System.out.println("The brandName is "+name);
		this.name = name;
	}

	public void price(int price) {
		System.out.println("The price is"+price);
		this.price = price;
	}

}
