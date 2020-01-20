package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Product;

@WebServlet("/ReadProductServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='utf-8'");
		
		int id = Integer.parseInt(request.getParameter("txtId"));
		
		Configuration conf = new Configuration();
		
		SessionFactory sessionfactory = conf.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.close();
		
	}

}
