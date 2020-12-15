package caelum.exemplos.testebanco;

public class TesteGerente {

	public static void main(String[] args) {

		ControleDeBonificacao controle = new ControleDeBonificacao();
		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
		controle.registrar(gerente);
		
		System.out.println(controle.getTotalDeBonificacoes());
	}

}
