package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public static final String USUARIO = "usuario";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException {
           doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException {
           PrintWriter resposta = response.getWriter();
           resposta.write("<html><body>");
           String nomeUsuario = request.getParameter(USUARIO);
           String senhaUsuario = request.getParameter("senha");
           // Login e senha corretos
           if (autenticar(nomeUsuario, senhaUsuario)) {
                  HttpSession sessao = request.getSession();
                  sessao.setAttribute(USUARIO, nomeUsuario);
                  resposta.write("Bem vindo, " + nomeUsuario);
           } else {
                  resposta.write("Usuário e senha inválidos");
           }
           resposta.write("</body></html>");
    }

    private boolean autenticar(String nomeUsuario, String senhaUsuario) {
           // Aqui entraria o código de autenticação.
           // Está verificando apenas se é diferente de nulo ou vazio
           return !("".equals(nomeUsuario) || "".equals(senhaUsuario)
                         || nomeUsuario == null || senhaUsuario == null);
    }
}