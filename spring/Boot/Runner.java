package com.xworkz.spring.Boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Component.PetrolBunk;
import com.xworkz.spring.configuration.BankConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		 ApplicationContext spring = new AnnotationConfigApplicationContext(BankConfiguration.class);
		 System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		 
		 PetrolBunk petrol= spring.getBean(PetrolBunk.class);
		 petrol.purchase();
		 
	}

}
