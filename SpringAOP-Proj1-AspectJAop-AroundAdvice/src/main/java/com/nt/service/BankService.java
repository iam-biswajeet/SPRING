package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bService")
public class BankService {
	public double calcSimpleInterest(int p,int t,int r) {
		System.out.println("BankService.calcSimpleInterest()");
		return p*t*r/100f;
	}
	public double calcComoundInterest(int p,int t,int r) {
		System.out.println("BankService.calcCompoundInterest()");
		return (p*Math.pow(1+r/100f, t))-p;
	}

}
