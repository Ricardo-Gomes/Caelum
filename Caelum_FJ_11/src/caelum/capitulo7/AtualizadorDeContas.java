package caelum.capitulo7;

public class AtualizadorDeContas {
	private double saldoTotalDeValores = 0;
	private double taxaSelic;
	
	public AtualizadorDeContas(double taxaSelic) {
		this.taxaSelic = taxaSelic;
	}
	
	public double getSaldoTotal() {
		return saldoTotalDeValores;
	}
	
	public void gerarAtualizacao (Conta conta) {
		System.out.println("Saldo sem a Taxa Selic: R$ " + conta.getSaldo());
		conta.atualizar(taxaSelic);
		System.out.println("Saldo com a Taxa Selic: R$ " + conta.getSaldo());
		saldoTotalDeValores += conta.getSaldo();
		System.out.println("-------------------");
	} 

}
