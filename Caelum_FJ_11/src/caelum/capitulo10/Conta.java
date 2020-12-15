package caelum.capitulo10;

public abstract class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;		
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public abstract void atualizar(double taxa);

}
