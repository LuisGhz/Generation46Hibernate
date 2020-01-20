package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.hibernate.model.Product;

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='utf-8'");
		PrintWriter ou = response.getWriter();
		
		Product product = new Product();
		Product myProduct = new Product();
		Product myProduct3 = new Product();
		
		product.setProduct(request.getParameter("txtProduct"));
		product.setProductName(request.getParameter("txtProductName"));
		product.setProductPrice(Double.parseDouble(request.getParameter("txtProductPrice")));
		
		String jsonString = request.getParameter("txtJson");
		
		Gson gson = new Gson();
		ObjectMapper myMapper = new ObjectMapper();
		
		myProduct = gson.fromJson(jsonString, Product.class);
		myProduct3 = myMapper.readValue(jsonString, Product.class);
		
		ou.append("My product 2 content: " + myProduct.toString());
		ou.append("My product 3 content: " + myProduct3.toString());
		ou.append(myMapper.writeValueAsString(myProduct3));
		ou.append(gson.toJson(product));
		
		//Crear el objeto de configuración
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//Crear el session factory
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		//Abrimos la sesión
		Session session = sessionFactory.openSession();
		
		//Se inicia el request
		Transaction tr = session.beginTransaction();
		
		//Iniciar el proceso de persistencia
		//CRUD - Create
		session.persist(product);
		
		//Cerramos la conexión
		session.close();
		//ou.append(String.format("Product %s Nombre: %s Precio: %f", product.getProduct(), product.getProductName(), product.getProductPrice()));
		*/
		ou.close();
	}

}
