package com.nt.aspect;

import java.io.PrintWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class DiscountCouponAspect {
	@AfterReturning(value="execution (double com.nt.service.OnlineShopping.doShopping(..))",returning = "billAmt")
	public void generateCoupon(JoinPoint jp,double billAmt) throws Exception{
		System.out.println("DiscountCouponAspect::generateCoupon");
		String couponMsg=null;
		if(billAmt>4000)
			couponMsg="30% discount on next order";
		else if(billAmt>3000)
			couponMsg="20% discount on next order";
		else if(billAmt>2000)
			couponMsg="10% discount on next order";
		else
			couponMsg="5% discount on next order";
		PrintWriter pw=new PrintWriter("coupon.txt");
		pw.println(couponMsg);
		pw.flush();
		pw.close();
			
	}

}
