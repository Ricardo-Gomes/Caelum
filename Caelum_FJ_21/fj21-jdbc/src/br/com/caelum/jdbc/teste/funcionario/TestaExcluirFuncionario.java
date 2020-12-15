package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaExcluirFuncionario {
	
public static void main(String[] args){
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 2);
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.remove(funcionario);
		
		System.out.println("Excluído!");
		
	}

}
