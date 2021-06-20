package aula03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletOlaPersonalizado")
public class ServletOlaPersonalizado extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		PrintWriter resposta = response.getWriter();
		resposta.write("<html><body>");
		resposta.write("Ol�, " + request.getParameter("nome")+ "!!!");	
		resposta.write("</html></body>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		PrintWriter resposta = response.getWriter();
		resposta.write("<html><body>");
		resposta.write("Ol�, " + request.getParameter("nome")+ "!!!");
		resposta.write("</html></body>");
	}
}