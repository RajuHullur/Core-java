package com.xworkz.exam.hallticket;

public class HallTicket {
	private String candidatesName;
	private String subjectNames[];
	private String usnNo;
	private String univercityName;

	public HallTicket(String candidatesName, String[] subjectNames, String usnNo, String univercityName) {

		this.candidatesName = candidatesName;
		this.subjectNames = subjectNames;
		this.usnNo = usnNo;
		this.univercityName = univercityName;
	}

	public void displayInfo() {
		System.out.println(" The candidates Name:" + this.candidatesName);
		System.out.println("The candidate usn no is : " + this.usnNo);
		System.out.println("The candidate univercityname is" + this.univercityName);
		for (int a = 0; a < subjectNames.length; a++) {
			System.out.println("The name of the subjects are :" + this.subjectNames[a]);
		}
	}
}
