package com.nt.sevice;

public class BankLoanService {
	public float calcSimpleInterestAmount(float pAmt,float rate,int year ) {
		System.out.println("BankLoanService.calcSimpleInterestAmount(-,-,-)");
		if(pAmt<=0 || rate<=0 || year<=0) {
			throw new IllegalArgumentException("invalid input");
		}
		float interest=(pAmt*rate*year)/100;
		try {
		Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return interest;
	}

}
