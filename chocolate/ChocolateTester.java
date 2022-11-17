package com.assingment.chocolate;

import com.assingment.DairyMilk;

public class ChocolateTester {
  public static void main(String[] args) {
	System.out.println("Well come to chocolate selection");
	Chocolate c=new Chocolate();
	c.brandName("Orange");
	c.brandflavour("Apple");
	
	DairyMilk d= new DairyMilk();
	c.brandName("Kit Kat");
	c.brandflavour("Mango");
}
}
