package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.component.Chrome;
import com.xworkz.spring2.component.FireBox;
import com.xworkz.spring2.configuration.BrowserConfiguration;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext spring =new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		Chrome chrome= spring.getBean(Chrome.class);
		chrome.browse();
		
		
		FireBox fire= spring.getBean(FireBox.class);
		fire.browse();
	}
}
