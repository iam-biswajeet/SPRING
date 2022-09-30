package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy(true)
public  final class DHL implements Courier{
	
	public DHL() {
		super();
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return "order no "+oid+" is delivered by DHL" ;
		
	}

}
