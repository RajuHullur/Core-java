package com.xworkz.exam.app;

import com.xworkz.exam.hallticket.HallTicket;

public class Exam {
	public HallTicket hallTicket;
	public int fees;

	public boolean allow(HallTicket hallTicket) {
		boolean isAllowed = false;
		System.out.println("Inside allow method");
		System.out.println("The fees paid is :" + this.fees);
		if (fees >= 1200) {
			System.out.println("Fees is paid");
			if (hallTicket != null) {
				this.hallTicket = hallTicket;
				this.hallTicket.displayInfo();
				isAllowed = true;
				System.out.println("Hallticket is been issued");
			}
		} else {
			System.out.println("pay the fees");
		}
		return isAllowed;
	}
}
