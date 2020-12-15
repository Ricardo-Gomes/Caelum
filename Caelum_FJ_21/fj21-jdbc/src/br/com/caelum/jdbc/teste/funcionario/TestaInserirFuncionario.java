package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInserirFuncionario {

	public static void main(String[] args){
		//pronto pra gravar
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("funcinario 3");
		funcionario.setUsuario("teste 3");
		funcionario.setSenha("teste123");
			
		//grave nessa conexão
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.adiciona(funcionario);
			
		System.out.println("Gravado!");
	}
}
