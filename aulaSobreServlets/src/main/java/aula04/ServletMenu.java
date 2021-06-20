package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter resposta = response.getWriter();
        resposta.write("<html><body>");
        HttpSession sessao = request.getSession(false);
        if (sessao == null || sessao.getAttribute(ServletLogin.USUARIO) == null) {
            resposta.write("<a href=\"login.html\">Faça primeiro o seu login</a><BR>");
        } else {
            resposta.write("<b>Operações disponíveis:</b><BR>");
            resposta.write("<a href=\"cadastro.html\">1. Cadastro</a><BR>");
            // Novas opções de funcionalidades entram aqui!
        }
        resposta.write("</body></html>");
	}

}