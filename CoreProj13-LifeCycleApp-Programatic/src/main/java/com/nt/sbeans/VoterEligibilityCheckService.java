package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class VoterEligibilityCheckService implements InitializingBean,DisposableBean {
	@Value("${per.name}")
	String pname;
	@Value("${per.age}")
	int age;
	@Value("${per.addrs}")
	String addrs;
	Date dov;
	@Override
	public void afterPropertiesSet() {
		System.out.println("VoterEligibilityCheckService.myInit()");
		if(pname==null||age<0)
			throw new IllegalArgumentException("Invalid Info");
		dov=new Date();
	}
	@Override
	public void destroy() {
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
	
