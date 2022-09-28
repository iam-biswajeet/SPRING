package com.nt.comps;

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
