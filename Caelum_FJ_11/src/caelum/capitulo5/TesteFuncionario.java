package caelum.capitulo5;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		data.dia = 13;
		data.mes = 03;
		data.ano = 2020;
		
		f1.nome = "Jo�ozinho";
		f1.salario = 1000;
		f1.dataDeAdmissao = data;
		f1.receberAumento(100);
		
		f1.mostrar();
		
		Funcionario f2 = new Funcionario();

		f2.nome = "Maria";
		f2.salario = 1000;
		
		System.out.println("-------------------------------");
		
		if (f1 == f2 ) {
			System.out.println("Os funcion�rios F1 e F2 s�o iguais");
		}else {
			System.out.println("Os funcion�rios F1 e F2  s�o diferentes");
		}
		
		System.out.println("-------------------------------");

		System.out.println("Salario atual funcion�rio F1 R$ : " + f1.salario);
		System.out.println("Ganho atual funcion�rio F1 R$ : " + f1.calcularGanhoAnual());
	}

}
