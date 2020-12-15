package caelum.capitulo6;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(3);

		empresa.setNomeEmpresa("RoSoftware");
		empresa.setCnpj("123456789/0001");
				
		Funcionario funcionario1 = new Funcionario();
		Data dataFuncionario1 = new Data(14, 03, 2020);
		
		funcionario1.setNome("Joãozinho"); 
		funcionario1.setDataDeAdmissao(dataFuncionario1);
		funcionario1.setDepartamento("TI");
		funcionario1.setRg("1111111");
		funcionario1.setSalario(1000);

		empresa.adicionar(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		Data dataFuncionario2 = new Data(14, 03, 2020);
		
		funcionario2.setNome("Joãozinho"); 
		funcionario2.setDataDeAdmissao(dataFuncionario1);
		funcionario2.setDepartamento("TI");
		funcionario2.setRg("1111111");
		funcionario2.setSalario(1000);

		empresa.adicionar(funcionario2);

		Funcionario funcionario3 = new Funcionario();
		Data dataFuncionario3 = new Data(14, 03, 2020);
		
		funcionario3.setNome("Joãozinho"); 
		funcionario3.setDataDeAdmissao(dataFuncionario1);
		funcionario3.setDepartamento("TI");
		funcionario3.setRg("1111111");
		funcionario3.setSalario(1000);

		empresa.adicionar(funcionario3);

		empresa.trabalhaNaEmpresa(funcionario1);
		empresa.trabalhaNaEmpresa(funcionario2);
		empresa.trabalhaNaEmpresa(funcionario3);

		empresa.mostrarFuncionarios();

	}

}
