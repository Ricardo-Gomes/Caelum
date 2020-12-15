package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.model.Contato;

public class RemoveContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		long id = Long.parseLong(request.getParameter("id"));

		Contato contato = new Contato();
		contato.setId(id);


		// passe a conexão no construtor
		Connection connection = (Connection) request.getAttribute("conexao");
		ContatoDAO contatoDAO = new ContatoDAO(connection);
		contatoDAO.exclui(contato);

		

		System.out.println("Excluindo contato...");
		return "mvc?logica=ListaContatoLogic";
	}

}
