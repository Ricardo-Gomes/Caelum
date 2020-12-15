package caelum.capitulo9;

public class ContaPoupanca extends Conta{

	@Override
	public void atualizar(double taxaPercentual) {
		this.saldo += this.saldo * taxaPercentual * 3;		
	}
}
