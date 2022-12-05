package com.xworkz.coffeshop.app;

import com.xworkz.coffeshop.coffeepowder.CoffeePowder;

public class CoffeeShop{

	public CoffeePowder coffeePowder ;
	public int amount;

	public boolean filtered(  CoffeePowder coffeepowder ) {
		boolean isFiltered = false;
		System.out.println("Is water is present ");
		System.out.println("The paid is :" + this.amount);
		if (amount >= 30) {
				System.out.println("amount is paid");
				if (coffeePowder != null) {
					this.coffeePowder = coffeePowder;
					this.coffeePowder.displayInfo();
					isFiltered = true;
					System.out.println("Filter is available ");
				}	
			 else {
				System.out.println("The Filter is Not available");
		}
		
		}
		return isFiltered;
}
}
			
