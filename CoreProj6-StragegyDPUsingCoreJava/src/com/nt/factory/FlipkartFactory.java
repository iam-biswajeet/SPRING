package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.Ekart;
import com.nt.comps.FirstFlight;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	public FlipkartFactory() {
		System.out.println("FlipkartFactory.FlipkartFactory()");
	}
	public static Flipkart getInstance(String courierType) {
		Courier courier;
		//create dependent class obj
		if(courierType.equalsIgnoreCase("bDart")) {
			courier=new BlueDart();
		}
		else if(courierType.equalsIgnoreCase("DHL")) {
			courier=new DHL();			
		}
		else if(courierType.equalsIgnoreCase("FF")) {
			courier=new FirstFlight();
		}
		else if(courierType.equalsIgnoreCase("Ekart")) {
			courier=new Ekart();
		}
		else  {
			throw new IllegalArgumentException("this is not a valid courier Type");
		}
		//Create Target Class Object
		Flipkart fkrt=new Flipkart();
		//assigning dep class obj to target calss 
		fkrt.setCourier(courier);
		return fkrt;
		
		
	}

}
