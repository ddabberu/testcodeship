package com.dvd.cdp.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//String url = request.getServletPath();
		String qs= request.getQueryString();
		
		String[] params = qs.split("&");  
	     Map<String, String> map = new HashMap<String, String>();  
	     for (String param : params)  
	     {  
	         String name = param.split("=")[0];  
	         String value = param.split("=")[1];  
	         map.put(name, value);  
	     }  
	     
	     
		
		//System.out.println( request.getQueryString()+ request.toString());
		//response.getWriter().println("H");
		
/*
		String as = request.getParameter("param1");
		String bs = request.getParameter("param2");
		String ops = request.getParameter("operation");
*/
	    String as= map.get("param1");
	    String bs= map.get("param2");
	    String ops= map.get("operation");
	    
		int a= Integer.parseInt(as);
		int b=Integer.parseInt(bs);
		// response.getWriter().println("The result of adding a to b is " + (1 +
		// 1) + ".");
		//response.getWriter().println("a=" + a + " b=" + b + " operation=" + ops + ".");
		System.out.println( "HERE12345");
		//response.getWriter().println("Yo");
		if( ops.equalsIgnoreCase("subtract"))
		{
			//response.getWriter().println("" +a+"-"+b+"=" +(a-b));
			response.getWriter().println("" +(a-b));
		}
		else if( ops.equalsIgnoreCase("add"))
		{
			//response.getWriter().println("" +a+"+"+b+"=" +(a+b));
			response.getWriter().println("" +(a+b));
		}
		else if( ops.equalsIgnoreCase("multiply"))
		{
			//response.getWriter().println("" +a+"*"+b+"=" +(a*b));
			response.getWriter().println("" +(a*b));
		}
		
		else if( ops.equalsIgnoreCase("divide"))
		{
			//response.getWriter().println("" +a+"*"+b+"=" +(a*b));
			if( b != 0)
				response.getWriter().println("" +(a/b));
			else response.getWriter().println("Operation not permitted.");
		}
		
		System.out.println( "8202014");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
