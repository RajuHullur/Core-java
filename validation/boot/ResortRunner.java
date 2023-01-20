package com.xworkz.validation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.service.ResortService;

public class ResortRunner {
	public static void main(String[] args) {
		
		ApplicationContext spring =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService ref= spring.getBean(ResortService.class);
		
		boolean saved=ref.validateAndSave(new ResortDTO());
		System.out.println("save"+saved);
	}

}
