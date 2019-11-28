package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id ="";
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id=cookie.getValue();
			}
		}
		}
		
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action = './login' method ='post' style=' content-align:center;width:400px; height:200px;background-color:gray;margin-left:200px; '>");
		out.println("<table align='center'>");
		out.println("<tr><td><a href=''>Home</a></td> </tr>");
		out.println("<tr style='margin-top:50px;'><td style='margin-top:50px;'>User ID</td><td><input type ='number' name='id' value='"+id+"' style='margin-bottom:10px; margin-top:10px;'></td></tr>");
		out.println("<tr><td>Password</td> <td><input type ='password' name='password'></td></tr>");
		out.println("<tr><td><input type ='checkbox' name='remember' value='checked'></td><td>Remeber Me</td></tr>");
		out.println("<tr><td><input  style ='position:float-right'type='submit' name='submit'></td></tr>");
		out.println("	<tr><td><a href='register.html'>Register</a></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("<html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

