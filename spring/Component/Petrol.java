package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	
	public Petrol() {
		System.out.println("Createed petrol using no-arg constucter");
		
	}

	@Override
	public void consume() {
		System.out.println("running consume from petrol");
		
	}
}
