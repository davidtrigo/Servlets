package com.countvowels.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.countvowels.main.CountVowels.Vowel;

/**
 * Servlet implementation class ServletVowels
 */
@WebServlet(description = "Servlet to count vowels", urlPatterns = { "/ServletVowels" })
public class ServletVowels extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVowels() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String word = request.getParameter("word");// se obtiene valor del parametro del formulario
		String result;
		int cont=0;
		if (word==null) {
				result="Error en la palabra";
		} else {
			
			CountVowels cv = new CountVowels(word);
			ArrayList<Vowel> list = new ArrayList<>();
			
			list = cv.arrayListVowels();
			
			for (int i = 0; i < list.size(); i++) {
				
				cont+=list.get(i).getN();
			}
			
			
			result= "La paralabra "+word+" contiene un total de"+cont+"vocal/es";
		}
		
		
		
		
	
		
	
		
		
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Contador de vocales </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+result+"</p>");
		out.println("<p>a</p>");
		out.println("<p>e</p>");
		out.println("<p>i</p>");
		out.println("<p>o/p>");
		out.println("<p>u</p>");
		
		//out.println("<h3>"+result+"</h3>");
	
		out.println("</body>");
		out.println("</html>");

	}

}
