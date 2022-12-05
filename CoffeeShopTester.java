package com.xworkz.coffeshop;

import com.xworkz.coffeshop.app.CoffeeShop;
import com.xworkz.coffeshop.coffeepowder.CoffeePowder;

public class CoffeeShopTester {
	public static void main(String[] args) {

		String ingrediantsNames[]= {"Sugar","Water","Flavour"};
	    CoffeePowder coffeePowder = new  CoffeePowder("Levista", ingrediantsNames) ;
	    {
		CoffeeShop coffeeShop = new CoffeeShop();
		coffeeShop.amount = 30;
		coffeeShop.filtered(coffeePowder);
	}
	}
}
