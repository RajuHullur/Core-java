package com.assingment.electronicdevice;

public class ElectronicDevice {
	public String name;
	public String colour;

	public void brandName(String name) {
		System.out.println("Brand Product is :" + name);
		this.name = name;

	}

	public void brandcolour(String colour) {
		System.out.println("Brand colour is:" + colour);
		this.colour=colour;
	}
}
