package com.ust.webapp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirecctServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String search = req.getParameter("search");
		String value = req.getParameter("select");
		
		if(value.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+search);
			
		}
		else if(value.equals("Yahoo")) {
		resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
		}
		else {
		resp.sendRedirect("https://www.google.com/search?q="+search);
		}
		
	}//end of doGet

}//end of RedirectServlet Class
