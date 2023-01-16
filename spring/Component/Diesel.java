package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;

@Component
public class Diesel  implements Fuel{

	@Override
	public void consume() {
		System.out.println("running consume from disel");

		
	}
	
	
	
	
	
	
	

}
