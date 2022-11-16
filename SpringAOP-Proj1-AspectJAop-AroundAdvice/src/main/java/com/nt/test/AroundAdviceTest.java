package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AroundAdviceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		BankService proxy=ctx.getBean("bService",BankService.class);
		System.out.println(proxy.getClass()+"\t"+proxy.getClass().getSuperclass());
		double simpleInterest=proxy.calcSimpleInterest(20000, 5, 2);
		System.out.println("simpleInterest::"+simpleInterest);
		System.out.println("====================================");
		double compoundInterest=proxy.calcComoundInterest(20000, 5, 2);
		System.out.println("compoundInterestt::"+compoundInterest);
		
	}
}
