package com.te.addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addition extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String parameter = req.getParameter("firstno");
		String parameter2 = req.getParameter("secondno");
	
		writer.println("<h1>FirstNumber : "+parameter+"</h1>");
		writer.println("<h1>SecondNumber : "+parameter2+"</h1>");
		int x=Integer.parseInt(parameter);
		int y=Integer.parseInt(parameter2);
		writer.println("<h1>Sum: "+(x+y)+"</h1>");
		
	}		
}
