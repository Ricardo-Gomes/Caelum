package br.com.caelum.jdbc.teste.contato;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaListaContato {

public static void main(String[] args){
		
		ContatoDao contatoDao = new ContatoDao();
		List<Contato> contatos = contatoDao.getLista();
		
		for(Contato contato : contatos){
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endere�o: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime());
			System.out.println("-------------------------------------");
		}
	}
}