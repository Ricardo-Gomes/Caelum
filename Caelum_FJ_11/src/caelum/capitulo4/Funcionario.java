package caelum.capitulo4;

public class Funcionario {

	String nome;
	String rg;
	String departamento;
	double salario;
	Data dataDeAdmissao;
	
	void receberAumento(double aumento) {
		this.salario += aumento;
	}
	
	double calcularGanhoAnual() {
		return this.salario * 12;
	}
	
	void mostrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data da entrada: " + this.dataDeAdmissao.dataFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calcularGanhoAnual());
		
	}
	
}
