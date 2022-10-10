package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest 
{
    public static void main( String[] args )
    {
    	//create spring container
       ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       //get access to target class obj
       PersonInfo info=ctx.getBean("per",PersonInfo.class);
       //print the object data
       System.out.println(info);
    }
}
