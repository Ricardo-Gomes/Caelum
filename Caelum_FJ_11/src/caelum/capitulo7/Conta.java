package caelum.capitulo7;

public class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void atualizar (double taxaPercentual) {
		this.saldo += this.saldo * taxaPercentual;
	}
}
