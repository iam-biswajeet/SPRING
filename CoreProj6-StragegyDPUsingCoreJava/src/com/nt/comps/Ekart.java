package com.nt.comps;

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
