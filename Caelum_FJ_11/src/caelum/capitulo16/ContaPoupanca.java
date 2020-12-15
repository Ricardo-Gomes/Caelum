package caelum.capitulo16;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override
	public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;
	}

	@Override
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

}
