package com.xworkz.spring.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	
	@Autowired
	@Qualifier("petrol")
	private Fuel petrol;
	
	
	@Autowired
	@Qualifier("diesel")
	private Fuel diesel;
	
	@Override
	public void purchase() {
		System.out.println("running purchase in shell");
		petrol.consume();
		diesel.consume();
		
		
	}
}
