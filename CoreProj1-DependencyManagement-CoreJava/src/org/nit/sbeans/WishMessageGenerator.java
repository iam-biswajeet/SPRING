package org.nit.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	//has-a proper ty to make class in composition
	private LocalDateTime ldt=null;
	//dependency mgmt logic
	public void setLdt(LocalDateTime ldt) {
		this.ldt=ldt;
	}
	//b.logic
	public String displayMessage(String name) {
		int hour=ldt.getHour();
		if(hour<12)
			return "Good Morning::"+name;	
		else if(hour<16)
			return "Good AfterNoon::"+name;	
		else if(hour<12)
			return "Good Evening::"+name;	
		else 
			return "Good Night::"+name;	
		}
}
