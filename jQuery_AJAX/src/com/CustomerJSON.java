package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(description = "Test_AJAX_Servlet", urlPatterns = { "/CustomerJSON_Path" })
public class CustomerJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CustomerJSON() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String str_id = request.getParameter("id");
		int id = 0;
		if(str_id != null){
			id = Integer.parseInt(str_id);
		}
		
		JSONObject customer = new JSONObject();
		customer.put("id", id);
		customer.put("FirstName", "John");
		customer.put("LastName", "Doe");
		
		writer.print(customer);		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		int customerCount = 0;
		String customerCount_str = request.getParameter("customerCount");
		customerCount = (customerCount_str == null)?2:Integer.parseInt(customerCount_str);
	
		JSONObject cust = null;
		JSONArray customers = new JSONArray();		
		for(int i = 0; i < customerCount; i++){
			cust = new JSONObject();
			cust.put("FirstName", "John" + i);
			cust.put("LastName", "Doe" + i);
			customers.add(cust);
		}		
		writer.print(customers);
		
		//For a response with a single JSON object:
//		JSONObject cust = new JSONObject();
//		cust.put("FirstName", "John");
//		cust.put("LastName", "Doe");		
//		writer.print(cust);
		
		
	}

}
