package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WishMessageGeneratorServlet extends HttpServlet{
	static {
		System.out.println("WishMessageGeneratorServlet.enclosing_method()");
	}
	public WishMessageGeneratorServlet(){
		System.out.println("WishMessageGeneratorServlet.WishMessageGeneratorServlet()");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("WishMessageGeneratorServlet.doGet()");
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		//b.logic
		if(hour<12) 
			pw.println("<h1>Good Morning</h1>");
		else if(hour<16) 
			pw.println("<h1>Good AfterNoon</h1>");
		else if(hour<20) 
			pw.println("<h1>Good Evening</h1>");
		else 
			pw.println("<h1>Good Night</h1>");

	}

}
