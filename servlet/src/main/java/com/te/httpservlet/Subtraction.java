package com.te.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Subtraction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer i = Integer.parseInt(req.getParameter("firstno"));
		Integer j = Integer.parseInt(req.getParameter("secondno"));
		PrintWriter writer = resp.getWriter();
		writer.println("Subration of two numbers is = " + (i - j));
	}

}
