package caelum.exemplos.testebanco;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Data dataFuncionario1 = new Data(14, 03, 2020);
		
		funcionario1.setNome("Joãozinho"); 
		funcionario1.setDataDeAdmissao(dataFuncionario1);
		funcionario1.setDepartamento("TI");
		funcionario1.setRg("1111111");
		funcionario1.setSalario(1000);
		funcionario1.receberAumento(100);
		
		funcionario1.mostrar();
		
		Funcionario funcionario2 = new Funcionario();
		Data dataFuncionario2 = new Data(14, 03, 2020);
		
		funcionario2.setNome("Joãozinho"); 
		funcionario2.setDataDeAdmissao(dataFuncionario1);
		funcionario2.setDepartamento("TI");
		funcionario2.setRg("1111111");
		funcionario2.setSalario(1000);
		
		System.out.println("-------------------------------");
		
		if (funcionario1 == funcionario2 ) {
			System.out.println("Os funcionários F1 e F2 são iguais");
		}else {
			System.out.println("Os funcionários F1 e F2  são diferentes");
		}
		
		System.out.println("-------------------------------");

		System.out.println("Salario atual funcionário F1 R$ : " + funcionario1.getSalario());
		System.out.println("Ganho atual funcionário F1 R$ : " + funcionario1.calcularGanhoAnual());
	}

}
