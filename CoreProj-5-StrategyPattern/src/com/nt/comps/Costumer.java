package com.nt.comps;

import java.util.Random;

public class Costumer implements Person {
	

	public Costumer() {
	System.out.println("Costumer.Costumer()");
	}

	@Override
	public String doTask() {
		return "buy Product"+new Random().nextInt(1000);
	}

}
