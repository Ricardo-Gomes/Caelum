package br.com.caelum.jdbc.teste.contato;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaExcluirContato {
	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setId((long) 3);

		ContatoDao contatoDao = new ContatoDao();
		contatoDao.remove(contato);

		System.out.println("Excluído!");

	}
}
