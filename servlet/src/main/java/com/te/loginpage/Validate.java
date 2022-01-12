package com.te.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String username = req.getParameter("uname");
		String password = req.getParameter("upass");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loginpage");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		String query = "select username from User where password =:pass";
		transaction.begin();
		Query createquery = em.createQuery(query);
		createquery.setParameter("pass", password);
		Object singleResult = null;
		try {
			singleResult = createquery.getSingleResult();
		} catch(NoResultException e) {
			writer.println("<h1>Invalid Credentials</h1>");	
		}
		
		if(singleResult.equals(username)) {
			resp.sendRedirect("./loginpage.html");
		} else {
			writer.println("<h1>Invalid Credentials</h1>");
		}
		transaction.commit();
		
	}
	

}
