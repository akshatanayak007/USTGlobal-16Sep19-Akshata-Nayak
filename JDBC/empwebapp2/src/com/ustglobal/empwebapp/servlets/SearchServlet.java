package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		else {
		int id = Integer.parseInt(req.getParameter("search"));
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = new EmployeeInfo();
		
		info = dao.searchEmployee(id);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href='./home'>Home</a>");
		out.println("<a style = 'float:right' href='./logout'>Logout</a>");
		
		out.println("<table align ='center'>");
		out.println("<tr>");
		out.println("<th>Id</th><th>Name</th><th>Email</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+info.getId()+"</td>");
		out.println("<td>"+info.getName()+"</td>");
		out.println("<td>"+info.getEmail()+"</td>");
	
		out.println("</tr>");
		out.println("</table>");
		out.println("/body");
		out.println("<html>");
		
		
	}
	
	}
}
