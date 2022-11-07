package com.nt.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateNamedParameterTest 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
    	int count=service.fetchEmployeeCountBySalaryRange(1000, 5000);
    	System.out.println("No of employee in given Range::"+count);
    }
}
