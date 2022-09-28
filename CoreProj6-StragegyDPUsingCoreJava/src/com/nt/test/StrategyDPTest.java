package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		System.out.println("StrategyDPTest.main()");
		//get Target class obj
		Flipkart fkrt=FlipkartFactory.getInstance("bDart");
		//call b.method
		String shoppingMsg=fkrt.shopping(new String[] {"shirt","shoe"}, new double[] {1000.0,2000.0});
		System.out.println(shoppingMsg);
	}

}
