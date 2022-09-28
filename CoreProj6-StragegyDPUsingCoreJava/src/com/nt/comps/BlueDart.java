package com.nt.comps;

public final class BlueDart implements Courier{
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "order no "+oid+" is delivered by BlueDart" ;
	}

}
