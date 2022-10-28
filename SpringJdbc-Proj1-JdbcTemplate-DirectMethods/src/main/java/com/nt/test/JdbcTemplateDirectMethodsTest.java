package com.nt.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		IEmployeeMgmtService empService=ctx.getBean("empService",IEmployeeMgmtService.class);
		System.out.println("=======================================================");
		int count=empService.fetchEmployeeCount();
		System.out.println("No of employee::"+count);
		System.out.println("=======================================================");
		double salary=empService.fetchEmployeeSalByEmpNo(7499);
		System.out.println("Salary of employee having empNo 7499 :: "+salary);
		System.out.println("========================================================");
		Map<String,Object>map=empService.fetchEmployeeByEmpNo(7499);
		System.out.println(map);
		System.out.println("========================================================");
		List<Map<String,Object>>list=empService.fetchEmployeeByEmpDesg("CLERK", "MANAGER");
		list.forEach(m->{System.out.println(m);});
		System.out.println("========================================================");
	}

}
