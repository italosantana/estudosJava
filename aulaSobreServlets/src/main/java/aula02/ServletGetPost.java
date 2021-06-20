package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException {
	PrintWriter saida = response.getWriter();
	saida.write("<HTML><BODY>Olá! ");
	saida.write("Mesma resposta para o método GET.");
	saida.write("</BODY></HTML>");
	saida.close();
}

protected void doPost(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException {
	PrintWriter saida = response.getWriter();
	saida.write("<HTML><BODY>Olá! ");	
	saida.write("Resposta para o método POST.");
	saida.write("</BODY></HTML>");
	saida.close();
	}
}