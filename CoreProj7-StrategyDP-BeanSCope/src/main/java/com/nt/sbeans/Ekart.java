package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ekart")
//@Scope("request")
public final class Ekart implements Courier {
	
	public Ekart() {
		super();
		System.out.println("Ekart.Ekart()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("Ekart.deliver()");
		return "order no "+oid+" is delivered by Ekart" ;
	}
}
