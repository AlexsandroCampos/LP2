package cadastro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cadastro() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String cep = request.getParameter("cep");
		String telefone = request.getParameter("telefone");
		
		if(nome.isEmpty() || endereco.isBlank() || bairro.isBlank() || cidade.isBlank() || cep.isBlank() || telefone.isBlank()) {
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		
		else {
			response.sendRedirect(request.getContextPath() + "/final.jsp");
		}
	}

}
