package com.xworkz.validation.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan(basePackages = "com.xworkz.validation")
public class SpringConfiguration {
	@Bean
	public Validator validator() {
		System.out.println("Running validator.....");
	
	
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	return validator;
}
}
