package com.nt.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import com.nt.servlet.WishMessageGeneratorServlet;

public class MyServletInitializer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		WishMessageGeneratorServlet generator =null;
		ServletRegistration.Dynamic dynamic=null;
		generator=new WishMessageGeneratorServlet();
		dynamic=ctx.addServlet("wish", generator);
		dynamic.addMapping("/wishurl");
		dynamic.setLoadOnStartup(5);
		
		
		
	}
}
