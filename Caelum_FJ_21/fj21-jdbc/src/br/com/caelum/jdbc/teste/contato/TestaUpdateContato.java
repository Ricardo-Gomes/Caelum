package br.com.caelum.jdbc.teste.contato;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaUpdateContato {

public static void main(String[] args){
		
		Contato contato = new Contato();
		contato.setNome("nome alterado");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 2);
		
		ContatoDao contatoDao = new ContatoDao();
		contatoDao.altera(contato);
		
		System.out.println("Alterado!");
		
	}
}
