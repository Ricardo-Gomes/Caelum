package caelum.exemplos.faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {

	private int horasAula;

	double getGastos() {
		return this.getSalario() + this.horasAula * 10;
	}

	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas aula: " + this.horasAula;
		return informacao;
	}
}
