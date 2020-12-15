package caelum.capitulo10;

public interface ExercAvancadoConta {
	public double getSaldo();
	public void depositar(double valor);
	public void sacar(double valor);
	public void atualizar(double taxaSelic);
}
