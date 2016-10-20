package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
