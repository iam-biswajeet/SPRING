package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ff")
@Scope("prototype")
public final class FirstFlight implements Courier{
	
	public FirstFlight() {
		super();
		System.out.println("FirstFlight.FirstFlight()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return "order no "+oid+" is delivered by FirstFlight" ;
	}

}
