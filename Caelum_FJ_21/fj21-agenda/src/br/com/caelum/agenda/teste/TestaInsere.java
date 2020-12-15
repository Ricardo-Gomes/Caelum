package br.com.caelum.agenda.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.model.Contato;



public class TestaInsere {

	public static void main(String[] args) throws SQLException {
		// pronto para gravar

		Contato contato = new Contato();
		contato.setNome("Contato2");
		contato.setEmail("contato2@contato.com.br");
		contato.setEndereco("R. teste2 12345 cs123 ");
		contato.setDataNascimento(Calendar.getInstance());

		// grava conexão

		ContatoDAO contatoDAO = new ContatoDAO();
		
		contatoDAO.adiciona(contato);
		
		System.out.println("Dados Gravado!");
	}

}
