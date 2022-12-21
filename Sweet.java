package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String args[]) {
		
		String swt1 = "Mysore pak";
		String swt2 = "Peda";
		String swt3 = "Burfie";
		String swt4 = "Jaamun";
		String swt5 = "Jalebi";
		String swt6 = "Baalusha";
		String swt7 = "Carrot halwa";
		String swt8 = "Kaju katli";
		String swt9 = "Ladoo";
		String swt10 = "Kulfi";
		String swt11 = "Kheer";
		String swt12 = "Rasgulla";
		String swt13 = "Lassi";
		
		Collection<String> sweets = new ArrayList();
		sweets.add(swt1);
		sweets.add(swt2);
		sweets.add(swt3);
		sweets.add(swt4);
		sweets.add(swt5);
		sweets.add(swt6);
		sweets.add(swt7);
		sweets.add(swt8);
		sweets.add(swt9);
		sweets.add(swt10);
		sweets.add(swt11);
		sweets.add(swt12);
		sweets.add(swt13);
		
		System.out.println(sweets.size());
		sweets.clear();
		System.out.println(sweets.size());
		
	}
}
