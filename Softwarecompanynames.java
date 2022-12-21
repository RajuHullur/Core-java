package com.xworkz.collections.collectionsforeachloop;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Softwarecompanynames {
   public static void main(String[] args) {
	String sotfwarecompanyname1="Cumulations Technologies";
	String sotfwarecompanyname2="Dx Minds Technologies";
	String sotfwarecompanyname3="Bigg App Technologies";
	String sotfwarecompanyname4="TechManyata ";
	String sotfwarecompanyname5="Mobinius";
	String sotfwarecompanyname6="Sakthi Infotech";
	String sotfwarecompanyname7="JVM Technologies";
	String sotfwarecompanyname8="Winprotech IT";
	String sotfwarecompanyname9="TATA  Technologies";
	String sotfwarecompanyname10="Ratnatech Technologies";
	String sotfwarecompanyname11="B2C Info";
	String sotfwarecompanyname12="Mobile application";
	String sotfwarecompanyname13="Siliciti";
	String sotfwarecompanyname14="Ecommerce";
	String sotfwarecompanyname15="Saankhya";
	String sotfwarecompanyname16="Nucot";
	String sotfwarecompanyname17="Website Design";
	String sotfwarecompanyname18="Appiness";
	String sotfwarecompanyname19="TheMath";
	String sotfwarecompanyname20="Fyle";
	
	Collection <String> softwarcomapanyname=new LinkedList<String>();
	
	softwarcomapanyname.add(sotfwarecompanyname1);
	softwarcomapanyname.add(sotfwarecompanyname2);
	softwarcomapanyname.add(sotfwarecompanyname3);
	softwarcomapanyname.add(sotfwarecompanyname4);
	softwarcomapanyname.add(sotfwarecompanyname5);
	softwarcomapanyname.add(sotfwarecompanyname6);
	softwarcomapanyname.add(sotfwarecompanyname7);
	softwarcomapanyname.add(sotfwarecompanyname8);
	softwarcomapanyname.add(sotfwarecompanyname9);
	softwarcomapanyname.add(sotfwarecompanyname10);
	softwarcomapanyname.add(sotfwarecompanyname11);
	softwarcomapanyname.add(sotfwarecompanyname12);
	softwarcomapanyname.add(sotfwarecompanyname13);
	softwarcomapanyname.add(sotfwarecompanyname14);
	softwarcomapanyname.add(sotfwarecompanyname15);
	softwarcomapanyname.add(sotfwarecompanyname16);
	softwarcomapanyname.add(sotfwarecompanyname17);
	softwarcomapanyname.add(sotfwarecompanyname18);
	softwarcomapanyname.add(sotfwarecompanyname19);
	softwarcomapanyname.add(sotfwarecompanyname20);
	
	
	for(String ref:softwarcomapanyname) {
		String ref1=ref;
		System.out.println(ref1);
	}
	System.out.println("====Itarator====");
	
	Iterator<String> iterator = softwarcomapanyname.iterator();
	
	while (iterator.hasNext()) {

		String element = iterator.next();
		iterator.remove();
		System.out.println(element);
	}
}
}
