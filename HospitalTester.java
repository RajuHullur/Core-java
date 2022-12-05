package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter The Patient Name");
		String patientName = sc.next();
		System.out.println("Enter The Patient Address");
		String address =sc.next();
		System.out.println("Enter The Patient Age");
		int age =sc.nextInt();
		
	    Patient  patient= new Patient(patientName, address, Gender.male , age );
	    
	    Hospital hospital = new Hospital();
	    hospital.isEmergency=true;
	    hospital.isTreatmentReqiured=true;
	    hospital.admit(patient);
	}
}
