package com.assingment.nonveg;

public class Nonveg {
   public String name;
   public String item;
  
   public void nonvegNmae ( String name) {
	   System.out.println("The nonveg name is"+name);
	   this.name=name;
	   
   }
   public void nonvegItem(String item) {
	   System.out.println("The nonveg item is "+item);
	   this.item=item;
   }
   public void displayInfo() {
	 
	   System.out.println("The nonveg name is"+name);
	   System.out.println("The nonveg item is "+item);
   }
   
}
