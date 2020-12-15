package br.com.caelum.agenda.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.model.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServletDAO extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter printWriter = response.getWriter();
		
		// parâmetros do request
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");
   
		Calendar dataNascimento = null;

		// conversão data
		try{
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		}catch (ParseException e) {
			throw new ServletException("Erro de conversão da data", e);
			
		}
		
		// motando objeto contato
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);
		
		//salvando o contato
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.adiciona(contato);
		
	
		//imprime o nome dos contatos adicionados
//		printWriter.println("<html>");
//		printWriter.println("<body>");
//		printWriter.println("Contato " + contato.getNome() + " adicionado com sucesso");
//		printWriter.println("</body>");
//		printWriter.println("</html>");

	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/contato-adicionado.jsp");
		requestDispatcher.forward(request, response);
	}
}
