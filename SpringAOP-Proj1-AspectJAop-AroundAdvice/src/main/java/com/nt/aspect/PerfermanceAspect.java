package com.nt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pAspect")
@Aspect
public class PerfermanceAspect {
	@Around("execution(double com.nt.service.BankService.*(..))")
	public Object perfermance(ProceedingJoinPoint pjp)throws Throwable{
		long start,end;
		System.out.println("before Target");
		start=System.currentTimeMillis();
		Object retValue=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println("Time Taken::"+(end-start));
		System.out.println("After Target");
		return retValue;
	}

}
