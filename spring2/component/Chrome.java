package com.xworkz.spring2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {

	
	@Autowired
	@Qualifier("jio")
	private  Provider provider;
	
	@Autowired
	@Qualifier("airtel")
	private  Provider provider1;
	
	@Override
	public void browse() {
		System.out.println(" Running chrome browser");
		
		provider.connect();
		provider1.connect();

	}

}
