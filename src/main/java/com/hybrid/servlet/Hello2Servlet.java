package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello2")
public class Hello2Servlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==========================");
		System.out.println("Hello2Servlet.doGet().....");
		System.out.println("==========================");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello2Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("==========================<br>"); //웹브라우져로 실행됨
		out.println("Hello2Servlet.doGet().....<br>");
		out.println("==========================<br>");
		out.println("<button><a href='http://localhost:8080/Hello.jsp'>Hello.jsp</a></button><br>");
		out.println("<button><a href='http://localhost:8080/Hello.html'>Hello.html</a></button><br>");
		out.println("<button><a href='http://localhost:8080/deptList.jsp'>deptList.jsp</a></button><br>");
		out.println("<button><a href='http://localhost:8080/Hello'>HelloServlet</a></button><br>");
		out.println("<button><a href='http://localhost:8080/Hello2'>Hello2Servlet</a></button><br>");
		out.print("</body>");
		out.println("</html>");
		
	}

	

}
