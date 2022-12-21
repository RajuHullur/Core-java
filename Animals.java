package com.xworkz.collections.collectionsforeachloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Animals {
	public static void main(String[] args) {
		String animal1 = "Tigar";
		String animal2 = "Elephent";
		String animal3 = "Cow";
		String animal4 = "Dog";
		String animal5 = "Ox";
		String animal6 = "lion";
		String animal7 = "Donkey";
		String animal8 = "Monkey";
		String animal9 = "Rabit";
		String animal10 = "Cat";

		Collection<String> animal = new ArrayList<String>();

		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(animal5);
		animal.add(animal6);
		animal.add(animal7);
		animal.add(animal8);
		animal.add(animal9);
		animal.add(animal10);

		for (String ref : animal) {//int i=0; i<animal.length;i++
			String ref1 = ref;      //String ref1=animal[i];
			//animal.remove(ref1);
			System.out.println(ref1);
		}
		System.out.println("=====Iterator=====");
		
		Iterator<String> iterator = animal.iterator();
		while (iterator.hasNext()) {

			String element = iterator.next();
			iterator.remove();
			System.out.println(element);

		}
		/*System.out.println("\nafter removing");
		while (iterator.hasNext()) {
			String element = iterator.next();

			System.out.println(element);
			iterator.remove();*/
		}
	}


