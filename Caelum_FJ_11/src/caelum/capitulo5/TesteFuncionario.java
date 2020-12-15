package caelum.capitulo5;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		data.dia = 13;
		data.mes = 03;
		data.ano = 2020;
		
		f1.nome = "Joãozinho";
		f1.salario = 1000;
		f1.dataDeAdmissao = data;
		f1.receberAumento(100);
		
		f1.mostrar();
		
		Funcionario f2 = new Funcionario();

		f2.nome = "Maria";
		f2.salario = 1000;
		
		System.out.println("-------------------------------");
		
		if (f1 == f2 ) {
			System.out.println("Os funcionários F1 e F2 são iguais");
		}else {
			System.out.println("Os funcionários F1 e F2  são diferentes");
		}
		
		System.out.println("-------------------------------");

		System.out.println("Salario atual funcionário F1 R$ : " + f1.salario);
		System.out.println("Ganho atual funcionário F1 R$ : " + f1.calcularGanhoAnual());
	}

}
