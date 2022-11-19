package com.nt.aspect;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("csra")
@Aspect
public class CarShowRoomAspect {
	@Before("execution (java.lang.String com.nt.service.CarShowRoom.*(..))")
	public void testDrive(JoinPoint jp) throws Throwable{
		System.out.println("CarShowRoomAspect.testDrive()");
		Object[] args=jp.getArgs();
		System.out.println(args[0]+" car price is "+args[1]);
		System.out.println("Do you like the Car?");
		Scanner sc=new Scanner(System.in);
		boolean flag=sc.nextBoolean();
		if(!flag) {
			throw new IllegalAccessException("Not Satisfied");
		}
		
	}
}
