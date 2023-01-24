package com.xworkz.linkedlisttask;

import java.util.LinkedList;

public class RemoveFirstAndlastElements {
	public static void main(String[] args) {
		
		//creating linked list
		LinkedList<String>list=new LinkedList<String>();
		
		//using add() method to add elements
		list.add("Xworkz");
		list.add("Collections");
		list.add("Exception");
		list.add("Inheritance");
		list.add("Polymorphism");
		 
		//creating linked list
		System.out.println("LinkedList:\t" +list);
		
		
		//remove the last element  removelast()
		System.out.println("The last element is removed:\t"+list.removeLast());
		System.out.println("-------------------------------------");
		
		
		//showing the final list
		System.out.println("Final linkedList:\t" +list);
		System.out.println("_____________________________________");
		
		//remove the first element
		System.out.println("The First Element is removed:\t"+list.removeFirst());
		System.out.println("_____________________________________");
		
		
		//"showing the final list"
		System.out.println("Final linkedList:\t" + list);
		System.out.println("_______________________________________");
		
		
				
	}

}
