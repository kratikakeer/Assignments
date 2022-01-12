package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");
		
		String[] parameterValues = req.getParameterValues("music");
		
		for (int i = 0; i < parameterValues.length; i++) {
			writer.println(parameterValues[i]);
			
		}
		writer.println("<h1>Welcome "+parameter+"</h1>");
		writer.println("<h1>Your Password Is "+parameter2+"</h1>");
		
		
		
	}

}
