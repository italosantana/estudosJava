package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletTela1CadastroSessao")
public class ServletTela1CadastroSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter resposta = response.getWriter();
        resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Dados Profissionais</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        HttpSession sessao = request.getSession(false);
        if (sessao == null
           || sessao.getAttribute(ServletLogin.USUARIO) == null) {
                resposta.write(
                "<a href=\"login.html\">Fa?a primeiro o seu login</a><BR>");
        } else {
            DadosPessoais dados = new DadosPessoais();
            dados.setNome(request.getParameter("nome"));
            dados.setSobrenome(request.getParameter("sobrenome"));
            dados.setRua(request.getParameter("rua"));
            dados.setComplemento(request.getParameter("complemento"));
            dados.setCidade(request.getParameter("cidade"));
            dados.setCep(request.getParameter("cep"));
            dados.setEstado(request.getParameter("estado"));
            sessao.setAttribute("dadosPessoais", dados);

	        resposta.write("Preencha seus dados profissionais:");
	        resposta.write("<form action=\"ServletTela2CadastroSessao\" method=\"POST\">");
	        resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
	        resposta.write("Endere?o profissional:<BR>");
	        resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
	        resposta.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
	        resposta.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
	        resposta.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
	        resposta.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
	        resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
	        resposta.write("</form>");
	        resposta.write("</body></html>");
        }
	}
}