package caelum.exemplos.testebanco;

public class Conta {

	int numero;
	double saldo;
	double limite;
	Cliente titular = new Cliente ();

	boolean sacar (double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void depositar (double valor) {
		this.saldo += valor;
	}

	void transferir (Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
}
