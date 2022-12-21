package com.xworkz.collections;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {
		
		public static void main(String args[]) {
			
			String cur1 = "Indian Rupee";
			String cur2 = "som";
			String cur3 = "Australian Dollar";
			String cur4 = "Aruban Florin";
			String cur5 = "Brazillian Real";
			String cur6 = "Pound Sterling";
			String cur7 = "Pataca";
			String cur8 = "Colombian Peso";
			String cur9 = "Comoro Franc";
			String cur10 = "Danish Krone";
			String cur11 = "Iranian Rial";
			String cur12 = "Rupaih";
			String cur13 = "Iraqi Dinar";
			String cur14 = "Kenyan Shilling";
			String cur15 = "North Korean Won";
			String cur16 = "Kuwaiti Dinar";
			String cur17 = "Us Dollar";
			String cur18 = "Kip";
			String cur19 = "Loti";
			String cur20 = "Denar";
			String cur21 = "Malagasy Ariary";
			String cur22 = "Rufiyaa";
			String cur23 = "Tugrika";
			String cur24 = "Metical";
			String cur25 = "Kyat";
			String cur26 = "Naira";
			
			Collection<String> currencies = new LinkedList();
			currencies.add(cur1);
			currencies.add(cur2);
			currencies.add(cur3);
			currencies.add(cur4);
			currencies.add(cur5);
			currencies.add(cur6);
			currencies.add(cur7);
			currencies.add(cur8);
			currencies.add(cur9);
			currencies.add(cur10);
			currencies.add(cur11);
			currencies.add(cur12);
			currencies.add(cur13);
			currencies.add(cur14);
			currencies.add(cur15);
			currencies.add(cur16);
			currencies.add(cur17);
			currencies.add(cur18);
			currencies.add(cur19);
			currencies.add(cur20);
			currencies.add(cur21);
			currencies.add(cur22);
			currencies.add(cur23);
			currencies.add(cur24);
			currencies.add(cur25);
			currencies.add(cur26);
			
			System.out.println(currencies.size());
			currencies.clear();
			System.out.println(currencies.size());
			
			
			
		}
}
