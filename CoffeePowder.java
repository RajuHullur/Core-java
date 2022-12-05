package com.xworkz.coffeshop.coffeepowder;

public class CoffeePowder {
	private String coffeePowderName;
	private String ingrediantsNames[];
	private int amount;

	public CoffeePowder(String coffeePowderName, String ingrediantsNames[]) {

		this.coffeePowderName = coffeePowderName;
		this.ingrediantsNames = ingrediantsNames;
		this.amount = amount;
	}

	public void displayInfo() {
		System.out.println("The CoffeePowder Name is:" + this.coffeePowderName);
		System.out.println("The  paid is:" + this.amount);
		for (int i = 0; i < ingrediantsNames.length; i++) {
			System.out.println("The name of ingrediantsNames are :" + this.ingrediantsNames[i]);
		}

	}
}
