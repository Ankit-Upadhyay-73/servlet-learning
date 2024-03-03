
package com.learn;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int re = num1 + num2;
		
//		req.setAttribute("r", re);
//		RequestDispatcher rq = req.getRequestDispatcher("sq");
//		rq.forward(req, res);
				
//		res.sendRedirect("sq?r="+re);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("r", re);
//		res.sendRedirect("sq");

		Cookie cookie = new Cookie("r",re + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
	}
}
