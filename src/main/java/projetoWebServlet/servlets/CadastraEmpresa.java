package projetoWebServlet.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetoWebServlet.modelos.Empresa;

/**
 * Servlet implementation class CadastraEmpresa
 */
@WebServlet("/cadastraEmpresa")
public class CadastraEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("O servlet cadastra empresa foi chamado");
		String nomeDaEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa(nomeDaEmpresa);
		System.out.println("O nome da empresa é: "+ empresa.getNome());
		
		response.sendRedirect("/projetoWebServlet/mensagemCadastroEmpresaSucesso.html");
		
	}

}
