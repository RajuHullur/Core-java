package com.xworkz.collections.collectionsforeachloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {
   public static void main(String[] args) {
	
	    int size1 = 1;
		int size2 = 2;
		int size3 = 3;
		int size4 = 4;
		int size5 = 5;
		int size6 = 6;
		int size7 = 7;
		int size8 = 8;
		int size9 = 9;
		int size10 = 10;
		int size11 = 11;
		int size12 = 12;
		int size13 = 13;
		int size14 = 14;
		int size15=15;

		Collection <Integer> sizes = new ArrayList<Integer>();
		sizes.add(size1);
		sizes.add(size2);
		sizes.add(size3);
		sizes.add(size4);
		sizes.add(size5);
		sizes.add(size6);
		sizes.add(size7);
		sizes.add(size8);
		sizes.add(size9);
		sizes.add(size10);
		sizes.add(size11);
		sizes.add(size12);
		sizes.add(size13);
		sizes.add(size14);
		sizes.add(size15);
		
		
		for(int size:sizes) {
			//System.out.println(size);
		}

		Iterator<Integer> ref1=sizes.iterator();	
		    while(ref1.hasNext()) {
			int watch=ref1.next();
			System.out.println("\n"+watch);	
}
}
}
