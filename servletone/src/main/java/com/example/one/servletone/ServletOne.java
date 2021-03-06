package com.example.one.servletone;


import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		name = name!=null?name:"";
		
		Date date = new Date(System.currentTimeMillis());
				
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Clasico Hello World!  </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1>Hola mundo de los Servlets</h1>");
		
		out.println("<p>Hola, "+name.toString()+"</p>");
		out.println("<p>Hora: "+date.toString()+"</p>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
