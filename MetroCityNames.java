package com.xworkz.collections.collectionsforeachloop;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MetroCityNames {
   public static void main(String[] args) {
	String metrocityname1="Bengaluru metro city";
	String metrocityname2="Pune metro city";
	String metrocityname3="Mumbai metro city";
	String metrocityname4="Chennai metro city";
	String metrocityname5="Kolkata metro city";
	
	Collection<String>  metrocitynames=new LinkedList<String>();
	 metrocitynames.add(metrocityname1);
	 metrocitynames.add(metrocityname2);
	 metrocitynames.add(metrocityname3);
	 metrocitynames.add(metrocityname4);
	 metrocitynames.add(metrocityname5);
	 

		for(String metrocityname:metrocitynames) {
			
			//System.out.println(metrocitynames);
		}
		System.out.println("=====Iterator=====");
		
		Iterator<String> iterator = metrocitynames.iterator();
		while (iterator.hasNext()) {

			String element = iterator.next();
			iterator.remove();
			System.out.println(element);

		}	
}
}
