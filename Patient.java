package com.xworkz.hospitalapp.patient;

public class Patient {
	public String patientName;
	public String address;
	public Gender gender;
	public int age;

	public Patient(String patientName, String address, Gender gender, int age) {		
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("Patient name is:" + patientName);
		System.out.println("Patient address is :" + address);
		System.out.println("Patient gender is :" + gender);
		System.out.println("Patient age is:" + age);
	}
}
