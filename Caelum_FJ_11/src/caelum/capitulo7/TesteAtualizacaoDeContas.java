package caelum.capitulo7;

public class TesteAtualizacaoDeContas {

	public static void main(String[] args) {
		Conta conta = new Conta();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		conta.depositar(1000);
		contaCorrente.depositar(1000);
		contaPoupanca.depositar(1000);
		
		AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);
		
		atualizadorDeContas.gerarAtualizacao(conta);
		atualizadorDeContas.gerarAtualizacao(contaCorrente);
		atualizadorDeContas.gerarAtualizacao(contaPoupanca);
		
		System.out.println("Saldo Total : R$ " + atualizadorDeContas.getSaldoTotal());
	}

}
