package caelum.capitulo10;

public class ExercAvancadoContaPoupanca implements ExercAvancadoConta {

	private double saldo;

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void atualizar(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 3;
	}

}
