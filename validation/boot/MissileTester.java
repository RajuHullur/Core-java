package com.xworkz.validation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.service.MissileService;

public class MissileTester {

	public static void main(String[] args) {
		ApplicationContext spring =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService ref= spring.getBean(MissileService.class);
		
		boolean saved=ref.vaildateAndSave(new MissileDTO());
		  System.out.println("saved"+saved);

	}
}
