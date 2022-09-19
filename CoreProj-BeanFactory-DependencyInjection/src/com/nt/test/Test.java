package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishMessageGenerator;

public class Test {
	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/config/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		WishMessageGenerator wmg=(WishMessageGenerator)obj;
		String message=wmg.getMessage("Biswajit");
		System.out.println(message);
	
	
	}

}
