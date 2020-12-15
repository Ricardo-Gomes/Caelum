package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.model.Contato;

public class ListaContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Contato> contatos = new ContatoDAO().getLista();
		
		request.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}

}
