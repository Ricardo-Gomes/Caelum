package br.com.caelum.agenda.teste;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.model.Contato;



public class TestaLista {

	public static void main(String[] args) throws SQLException {
		ContatoDAO contatoDao = new ContatoDAO();

		// lista de contatos
		List<Contato> contatos = contatoDao.getLista();

		// interação na lista

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			
			Date dataNascimento = contato.getDataNascimento().getTime();
			SimpleDateFormat formatar = new SimpleDateFormat("dd-MM-yyyy");
			String formatarData = formatar.format(dataNascimento);
			
			System.out.println("Data de nascimento: " + formatarData);
			System.out.println("----------");
		}
	}

}
