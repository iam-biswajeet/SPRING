package com.nt.aspect;

import java.io.PrintWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class ExceptionLoggerAndGrappher {
	@AfterThrowing(value="execution(double com.nt.service.OnlineShopping.doShopping(..))",throwing = "e")
	public void generateExceptionLoggerAndGrappher(JoinPoint jp,RuntimeException e) throws Throwable{
		System.out.println("ExceptionLoggerAndGrappher::generateExceptionLoggerAndGrappher");
		//Logging
		PrintWriter pw=new PrintWriter("exception_log.txt");
		pw.println(e+"in "+jp.getSignature()+" "+Arrays.deepToString(jp.getArgs()));
		pw.close();
		//Grapher
		throw new InValidProductException(e.getMessage());
	}
	
}
