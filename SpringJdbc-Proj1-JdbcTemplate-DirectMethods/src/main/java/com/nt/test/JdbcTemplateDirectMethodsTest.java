package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		IEmployeeMgmtService empService=ctx.getBean("empService",IEmployeeMgmtService.class);
		int count=empService.fetchEmployeeCount();
		System.out.println("No of employee::"+count);
	}

}
