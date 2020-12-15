package caelum.capitulo9;

public class ContaCorrente extends Conta{

	public void atualizar (double taxaPercentual) {
		this.saldo += this.saldo * taxaPercentual * 2;
	}
	
	public void depositar (double valor) {
		this.saldo += valor - 0.10;
	}

}
