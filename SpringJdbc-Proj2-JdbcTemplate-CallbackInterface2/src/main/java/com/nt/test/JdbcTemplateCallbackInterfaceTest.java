package com.nt.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateCallbackInterfaceTest 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
    	Employee emp=service.fetchEmployeeByNo(7499);
    	System.out.println(emp);
    	System.out.println("====================================================");
    	List<Employee> empsList=service.fetchEmployeeDetailsByDesg("CLERK");
    	empsList.forEach(System.out::println);
    	
    }
}
