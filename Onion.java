package com.assingment;

import com.assingment.vegitable.Vegitable;

public class Onion extends Vegitable {
	
        public static void main(String[] args) {
			Vegitable v=new Vegitable();
			v.name="onion";
			v.items="Onion,   Carrot,  Beans";
			v.price= 100;
			v.vitamins="vitaminc, vitamin B6";
		  v.displayInfo();
		}	
 
}
