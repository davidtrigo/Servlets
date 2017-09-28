package com.example.one.servletone;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletIMC
 */
@WebServlet("/ServletIMC")
public class ServletIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String strAltura = request.getParameter("altura");
		String strPeso = request.getParameter("peso");
		String result="";
		
		float altura =Float.valueOf(strAltura);
		float peso =Float.valueOf(strPeso);
	
		if((strAltura==null || strPeso==null) || (peso <= 0 || altura <=0)){
			
			
			
			result = " Error ";
		
		}else{
		
			float imc = peso/(altura*altura);
			DecimalFormat df = new DecimalFormat("0.00"); 
			df.format(imc);
			result = "Tu IMC es: "+String.valueOf(imc) ;
			
		} 

		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Indice Masa Corporal IMC </title>");
		out.println("</head>");
		out.println("<body>");
		
		
		
		out.println("<h3>"+result+"</h3>");
		out.println("<p><a href='/servletone/IMC.html'>Atras</a></p>"); 
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

}
