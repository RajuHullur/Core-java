package com.xworkz.collections.collectionsforeachloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	public static void main(String[] args) {
		String watch1 = "Fastrack";
		String watch2 = "HMT";
		String watch3 = "Realme";
		String watch4 = "Apple";
		String watch5 = "Nova";

		Collection<String> watch = new ArrayList<String>();
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);

		for (String ref : watch) {
			System.out.println(ref);
		}

		Iterator<String> iterator = watch.iterator();
		while (iterator.hasNext()) {

			String element = iterator.next();
			iterator.remove();
			System.out.println(element);
		}
	}
}
