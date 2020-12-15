package caelum.exemplos.faculdade;

public class EmpregadoDaFaculdade {

	private String nome;
	private double salario;
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double getGastos() {
		return this.salario;
	}
	
	String getInfo() {
		return "nome: " + this.nome + " com salario " + this.salario;
	}
}
