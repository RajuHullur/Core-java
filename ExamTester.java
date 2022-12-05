package com.xworkz.exam;

import com.xworkz.exam.app.Exam;
import com.xworkz.exam.hallticket.HallTicket;
import com.xworkz.exam.supplementaryexam.SupplementaryExam;

public class ExamTester {
	public static void main(String[] args) {
		
		String subjectNames[]= {"OR","M1","SOM","MOM"};
	    HallTicket hallTicket = new HallTicket("Raju", subjectNames, "1dbgtd234", "VTU");
		Exam exam = new Exam();
		exam.fees = 1200;
		exam.allow(hallTicket);
		
		System.out.println("Going  to Supplementary Exam");
		Exam exam1= new SupplementaryExam(2);
		exam1.fees=1300;
		exam1.allow(hallTicket); 
    }
    }

