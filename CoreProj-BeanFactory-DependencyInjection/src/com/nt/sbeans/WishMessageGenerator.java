package com.nt.sbeans;

import java.util.Date;

public class WishMessageGenerator {
	// HAS-A-Property
	private Date date;
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		this.date=date;
	}

	// setter method
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	// get hour
	public String getMessage(String user) {
		int hour = date.getHours();
		System.out.println(date);
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good AfterNoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";

	}
}
