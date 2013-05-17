package com.xebia.cd.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	
	private static final long serialVersionUID = -3571532139899967565L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data = new DemoSource().readData();
    	resp.getWriter().print("<html><body><h1>" + data + "</h1></body></html>");
    	resp.setContentType("text/html");
    }
	
	protected void doSomething() {
		
	}
}
