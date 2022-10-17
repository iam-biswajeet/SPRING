package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoterEligibilityCheckService;

public class SpringBeanLifeCycleAnnotationTest 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       VoterEligibilityCheckService service=ctx.getBean("voter",VoterEligibilityCheckService.class);
       String msg=service.checkVotingEligibility();
       System.out.println(msg);
    
    
    }
}
