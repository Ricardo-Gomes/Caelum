package caelum.capitulo11;

public class TesteDeposito {
	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		try {
			contaPoupanca.depositar(-1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
