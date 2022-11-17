package com.assingment.smartcity;

public class SmartCity {
	public String name;
	public String city;
	public String population;

	public void name(String name) {
		System.out.println("SmartCity name is" + name);
		this.name = name;
	}

	public void city(String city) {
		System.out.println("SmartCity is" + city);
		this.city = city;
	}

	public void population( String population) {
		System.out.println("SmartCity of the population is" + population);
		this.population= population;

	}
}
