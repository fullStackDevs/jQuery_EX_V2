package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.OperationStatus;
import model.User;

/**
 * Servlet implementation class User_JSON_EX
 */
@WebServlet(urlPatterns = {"/User_JSON_EX_Path"})
public class User_JSON_EX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public User_JSON_EX() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		JSONObject receivedUser = null;
		User user = new User();
		JSONObject responseJSONObj = null;
		JSONParser parser = new JSONParser();
		try{
			 receivedUser = (JSONObject) parser.parse(request.getParameter("cust"));
			//Fake a save in the DB
			 user.setID(343);
			 user.setFirstName((String)receivedUser.get("firstName"));
			 user.setLastName((String)receivedUser.get("lastName"));
			 
			 //Create a response for the request
//			 OperationStatus opStatusSaveUser = new OperationStatus();
//			 opStatusSaveUser.setInsertedID(usr.getID());
//			 opStatusSaveUser.setStatus(true);
//			 opStatusSaveUser.setMessage("Customer inserted: " + usr.getFirstName() + " " + usr.getLastName());
			 
			 responseJSONObj = new JSONObject();
			 responseJSONObj.put("ID", user.getID());
			 responseJSONObj.put("status", true);
			 responseJSONObj.put("message", "Customer inserted: " + user.getFirstName() + " " + user.getLastName());
			 
			 
		}catch(ParseException e){
			e.printStackTrace();
		};
		
		writer.print(responseJSONObj);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
