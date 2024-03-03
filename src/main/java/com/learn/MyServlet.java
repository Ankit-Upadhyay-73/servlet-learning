package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 		ServletConfig & ServletContext
 */

public class MyServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();
		out.println("Hi");
		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		out.println(str);
		
		ServletConfig con = getServletConfig();
		String str = con.getInitParameter("name");
		out.println(str);
	}
}
