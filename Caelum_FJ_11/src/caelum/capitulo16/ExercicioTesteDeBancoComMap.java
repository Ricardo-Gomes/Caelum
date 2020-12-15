package caelum.capitulo16;

public class ExercicioTesteDeBancoComMap {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setCliente("Joãozinho");
		contaCorrente.depositar(200);
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setCliente("Mariazinha");
		contaPoupanca.depositar(500);
		
		ExercicioBancoComMap contas = new ExercicioBancoComMap();
		
		contas.adicionar(contaCorrente);
		contas.adicionar(contaPoupanca);
		
		System.out.println(contas.buscarPorCliente("Mariazinha"));
	}

}
