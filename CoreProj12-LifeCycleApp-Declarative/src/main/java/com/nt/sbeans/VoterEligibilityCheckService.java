package com.nt.sbeans;

import java.util.Date;

public class VoterEligibilityCheckService {
	
	String pname;
	int age;
	String addrs;
	Date dov;
	
	public void setPname(String pname) {
		System.out.println("VoterEligibilityCheckService.setPname()");
		this.pname = pname;
	}
	public void setAge(int age) {
		System.out.println("VoterEligibilityCheckService.setAge()");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("VoterEligibilityCheckService.setAddrs()");
		this.addrs = addrs;
	}
	public void myInit() {
		System.out.println("VoterEligibilityCheckService.myInit()");
		if(pname==null||age<0)
			throw new IllegalArgumentException("Invalid Info");
		dov=new Date();
	}
	public void myDestory() {
		System.out.println("VoterEligibilityCheckService.myDestory()");
		pname=null;
		age=0;
		addrs=null;
		dov=null;
	}
	public String checkVotingEligibility() {
		System.out.println("VoterEligibilityCheckService.checkVotingEligibility()");
		if(age>=18)
			return "Mr "+pname+" you are eligible to vote on "+dov;
		else
			return "Mr "+pname+" you are not eligible to vote on "+dov;
			
	}

}
