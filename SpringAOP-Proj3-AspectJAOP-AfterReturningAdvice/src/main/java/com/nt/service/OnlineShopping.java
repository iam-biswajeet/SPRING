package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class OnlineShopping {
	public double doShopping(String[] product,double[] prices) {
		System.out.println("OnlineShopping::doShopping");
		double total=0.0;
		for(double p:prices) {
			total+=p;
		}
		return total;
	}

}
