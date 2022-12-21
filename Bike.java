package com.xworkz.collections;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {

	public static void main(String[] args) {

		String bk1 = "java";
		String bk2 = "Tvs";
		String bk3 = "ktm";
		String bk4 = "Duke";
		String bk5 = "Splender";
		String bk6 = "Pulser";
		String bk7 = "Mt15";
		String bk8 = "Hero";
		String bk9 = "Bazaz";
		String bk10 = "RC200";
		String bk11 = "Yamaha";
		String bk12 = "Ninza";
		String bk13 = "Royalenfield";
		String bk14 = "Appirilia";
		String bk15 = "Raven";
		String bk16 = "Suzuki";
		String bk17 = "Cruiser";
		String bk18 = "Olacabs";

		Collection<String> bikes = new TreeSet();
		bikes.add(bk1);
		bikes.add(bk2);
		bikes.add(bk3);
		bikes.add(bk4);
		bikes.add(bk5);
		bikes.add(bk6);
		bikes.add(bk7);
		bikes.add(bk8);
		bikes.add(bk9);
		bikes.add(bk10);
		bikes.add(bk11);
		bikes.add(bk12);
		bikes.add(bk13);
		bikes.add(bk14);
		bikes.add(bk15);
		bikes.add(bk16);
		bikes.add(bk17);
		bikes.add(bk18);

		System.out.println(bikes.size());
		bikes.clear(); 
		System.out.println(bikes.size());

	}
}
