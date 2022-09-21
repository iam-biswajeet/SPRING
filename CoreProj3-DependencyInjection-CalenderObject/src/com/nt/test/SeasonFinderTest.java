package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonGeneratorUsingMonthApp;

public class SeasonFinderTest {
	public static void main(String[] args) {
		//create the spring Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the target class object
		/*Object obj=ctx.getBean("season");
		//typecasting
		SeasonGeneratorUsingMonthApp sga= (SeasonGeneratorUsingMonthApp)obj;
		*/
		SeasonGeneratorUsingMonthApp sga=ctx.getBean("season",SeasonGeneratorUsingMonthApp.class);
		//execte b.logic
		String message=sga.getMessage("Biswajit");
		System.out.println(message);
	}

}
