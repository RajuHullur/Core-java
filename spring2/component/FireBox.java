package com.xworkz.spring2.component;

import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {

	@Override
	public void browse() {
		System.out.println("Running fire Box");
		
	}

}
