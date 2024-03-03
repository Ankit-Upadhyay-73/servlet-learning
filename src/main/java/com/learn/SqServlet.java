package com.learn;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{

//		HttpSession session = req.getSession();
		Cookie cookies[] = req.getCookies();
		
		int r = 0;
		for(Cookie c:cookies) {
			if(c.getName().equals("r")) {
				r = Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out = res.getWriter();
		r *= r;

		out.println("Square is "+r);
	}
}
