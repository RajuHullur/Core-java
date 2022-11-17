package com.assingment.electronicdevice;

import com.assingment.Laptop;

public class ElectronicDeviceTester {

	public static void main(String[] args) {
		System.out.println("Well Come to ElectronicDevice");
		ElectronicDevice device = new ElectronicDevice();
		device.brandName("Realme");
		device.brandcolour("gold");

		Laptop lp = new Laptop();
		lp.brandName("Asus");
		lp.brandcolour("Silver White");

	}
}
