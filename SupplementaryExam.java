package com.xworkz.exam.supplementaryexam;

import com.xworkz.exam.app.Exam;
import com.xworkz.exam.hallticket.HallTicket;

public class SupplementaryExam extends Exam {
	int noOfAttempts;

	public SupplementaryExam(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	@Override
	public boolean allow(HallTicket hallticket) {
		System.out.println("Invoked allow method of SupplementaryExam");
		if (noOfAttempts > 1) {
			return super.allow(hallTicket);
		}
		return false;
	}
}
