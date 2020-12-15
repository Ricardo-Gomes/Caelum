package caelum.capitulo16;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void depositar(double valor) {
		this.saldo += valor - 0.10;
	}
	
	public double calcularTributos() {
		return this.getSaldo() * 0.01;
	}

}
