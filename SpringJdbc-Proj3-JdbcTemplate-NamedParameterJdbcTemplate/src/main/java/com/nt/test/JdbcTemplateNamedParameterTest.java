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
    	System.out.println("=============================================");
    	List<Employee> list=service.fetchEmpsByDesg("CLERK", "MANAGER");
    	list.forEach(System.out::println);
    	System.out.println("===============================================================");
    	Employee emp=new Employee();
    	emp.setEmpno(7005);
    	emp.setEname("Balabhadra");
    	emp.setJob("SALESMAN");
    	emp.setSal(3000.0f);
    	
    	String regMessage=service.registerEmployee(emp);
    	System.out.println(regMessage);
    	ctx.close();
    }
}
