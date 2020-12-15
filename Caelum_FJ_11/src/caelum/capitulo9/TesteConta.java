package caelum.capitulo9;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		conta.depositar(1000);
		
		contaCorrente.depositar(1000);
		contaPoupanca.depositar(1000);
		
		conta.atualizar(0.01);
		contaCorrente.atualizar(0.01);
		contaPoupanca.atualizar(0.01);
		
		System.out.println(conta.getSaldo());
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}
