package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Target Class
@Component("wmg")
public class WishMessageGeneratorApp {
	// HAS-A PROPERTY
	// field Injection
	 @Autowired
	private LocalDateTime ldt;

	// constructor injection
	/*@Autowired
	public WishMessageGeneratorApp(LocalDateTime ldt) {
		this.ldt=ldt;
	}
	@Autowired
	public WishMessageGeneratorApp() {
		
	}
	//Stter Method For Dependency Injection
	@Autowired
	public void setLdt(LocalDateTime ldt) {
		this.ldt=ldt;
	}*/
	// b.logic method
	/*arbitary method injection
	@Autowired
	public void assign(LocalDateTime ldt) {
		this.ldt=ldt;
	}*/
	public String getMessage(String user) {
		int hour = ldt.getHour();
		System.out.println("WishMessageGeneratorApp.getMessage()::" + ldt);

		if (hour < 12)
			return "Good Morning::" + user;
		if (hour < 16)
			return "Good AfterNoon::" + user;
		if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;
	}

}
