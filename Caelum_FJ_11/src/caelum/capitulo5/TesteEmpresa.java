package caelum.capitulo5;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		empresa.nomeEmpresa = "RoSoftware";
		empresa.cnpj = "123456789/0001";
		empresa.arrayFuncionarios = new Funcionario[10];

		Funcionario funcionario1 = new Funcionario();
		Data dataFuncionario1 = new Data();
		dataFuncionario1.dia = 13;
		dataFuncionario1.mes = 03;
		dataFuncionario1.ano = 2020;
		funcionario1.nome = "Joãozinho";
		funcionario1.dataDeAdmissao = dataFuncionario1;
		funcionario1.departamento = "TI";
		funcionario1.rg = "1111111";
		funcionario1.salario = 1000;

		empresa.adicionar(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		Data dataFuncionario2 = new Data();
		dataFuncionario2.dia = 13;
		dataFuncionario2.mes = 03;
		dataFuncionario2.ano = 2020;
		funcionario2.nome = "Maria";
		funcionario2.dataDeAdmissao = dataFuncionario2;
		funcionario2.departamento = "TI";
		funcionario2.rg = "1111111";
		funcionario2.salario = 1000;

		empresa.adicionar(funcionario2);

		Funcionario funcionario3 = new Funcionario();
		Data dataFuncionario3 = new Data();
		dataFuncionario3.dia = 13;
		dataFuncionario3.mes = 03;
		dataFuncionario3.ano = 2020;
		funcionario3.nome = "Junin";
		funcionario3.dataDeAdmissao = dataFuncionario3;
		funcionario3.departamento = "TI";
		funcionario3.rg = "1111111";
		funcionario3.salario = 1000;

		empresa.adicionar(funcionario3);

		empresa.trabalhaNaEmpresa(funcionario1);
		empresa.trabalhaNaEmpresa(funcionario2);
		empresa.trabalhaNaEmpresa(funcionario3);

		empresa.mostrarFuncionarios();

	}

}
