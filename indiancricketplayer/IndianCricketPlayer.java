package com.assingment.indiancricketplayer;

public class IndianCricketPlayer {
	public String name;
	public int age;
	
	public void playerName(String name) {
		System.out.println("The  IndianCricketPlayer name is" + name);
		this.name = name;
	}

	public void playerAge(int age) {
		System.out.println("The  IndianCricketPlayer age is" + age);
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("The  IndianCricketPlayer name is" + name);
		System.out.println("The  IndianCricketPlayer age is" + age);
	}

}
