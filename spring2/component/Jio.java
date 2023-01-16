package com.xworkz.spring2.component;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("jio connector");
		
	}

}
