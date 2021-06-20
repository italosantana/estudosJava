package aula03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter resposta = response.getWriter();

        resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("rua"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complemento"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidade"));
        resposta.write(", ");
        resposta.write(request.getParameter("cep"));
        resposta.write(", ");
        resposta.write(request.getParameter("estado"));
        resposta.write("<br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write(request.getParameter("empresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("ruaEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complementoEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidadeEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("cepEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("estadoEmpresa"));
        resposta.write("</body></html>");
	}

}
