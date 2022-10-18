package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGeneratorService {
	public WishMessageGeneratorService() {
		System.out.println("WishMessageGeneratorService::0-arg Constructor");
	}
	@Autowired
	private LocalDateTime ldt;
//b.method
	public String messageGenerator(String user) {
		System.out.println("WishMessageGeneratorService.messageGenerator()");
		int hour = ldt.getHour();
		if (hour < 12) {
			return "Good Morning  " + user;
		} else if (hour < 16) {
			return "Good AfterNoon  " + user;
		} else if (hour < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}
}
