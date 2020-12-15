package caelum.capitulo7;

public class ContaPoupanca extends Conta{

	public void atualizar (double taxaPercentual) {
		this.saldo += this.saldo * taxaPercentual * 3;
	}
}
