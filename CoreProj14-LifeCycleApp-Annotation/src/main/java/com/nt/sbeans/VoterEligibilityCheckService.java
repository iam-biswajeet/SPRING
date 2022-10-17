package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class VoterEligibilityCheckService {
	
	@Value("${per.name}")
	String pname;
	@Value("${per.age}")
	int age;
	@Value("${per.addrs}")
	String addrs;
	Date dov;
	
	@PostConstruct
	public void myInit() {
		System.out.println("VoterEligibilityCheckService.myInit()");
		if(pname==null||age<0)
			throw new IllegalArgumentException("Invalid Info");
		dov=new Date();
	}
	@PreDestroy
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
