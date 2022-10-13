package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fkrt")
public final class Flipkart {
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}
	//has- a property
	@Autowired
	//@Qualifier("${courier.name}")
	@Qualifier("courierType")
	Courier courier;
	
	public String shopping(String[] items,double[] prices) {
		System.out.println("Flipkart.shopping()");
		//write the logic for bill calc
		double billAmt=0.0;
		for(int i=0;i<prices.length;i++) {
			billAmt=billAmt+prices[i];
		}
		//generate a order id
		int oid=new Random().nextInt(1000);
		//deliver the product
		String deliveryMessage=courier.deliver(oid);
		//display the Shopping details
		return Arrays.toString(items)+"  are purcased billa amount "+billAmt+" "+deliveryMessage;
		
		
	}
}
