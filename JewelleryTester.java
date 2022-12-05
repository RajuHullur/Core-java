package com.jewellery.app;

public class JewelleryTester {
 
	public static void main(String args) {
		String gold=" chain";
		String silver= "earing";
		String diamond= "ring";
		String platinum= "chain";
		String metallic= "watch";
		
		Jewellery Jewel= new Jewellery(belt,false,8373977,gold,silver,diamond, platinum , metallic);
		System.out.println(Jewel.type);
		System.out.println(Jewel.price);
		System.out.println(Jewel.quality);
		System.out.println(Jewel.size);
		System.out.println(Jewel.weight);
		
	}
}
