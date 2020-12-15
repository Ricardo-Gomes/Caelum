package br.com.caelum.jdbc.teste.contato;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsereContato {

	public static void main(String[] args){
		//pronto pra gravar
		Contato contato = new Contato();
		contato.setNome("Caelum3");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		//grave nessa conexão
		ContatoDao contatoDao = new ContatoDao();
		contatoDao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
