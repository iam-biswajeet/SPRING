package com.nt.test;

import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		/*
		 * SeasonGeneratorUsingMonthApp
		 * sga=ctx.getBean("season",SeasonGeneratorUsingMonthApp.class); //execte
		 * b.logic String message=sga.getMessage("Biswajit");
		 * System.out.println(message);
		 */
		Calendar cal1=ctx.getBean("java.util.Calendar#0",Calendar.class);
		System.out.println(cal1);
		Calendar cal2=ctx.getBean("java.util.Calendar#1",Calendar.class);
		System.out.println(cal2);
		SeasonGeneratorUsingMonthApp sgum=ctx.getBean("seasonGeneratorUsingMonthApp",SeasonGeneratorUsingMonthApp.class);
		sgum.getMessage("Biswajit");
	}

}
