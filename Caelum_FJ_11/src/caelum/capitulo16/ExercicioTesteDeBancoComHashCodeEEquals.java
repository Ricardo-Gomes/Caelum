package caelum.capitulo16;

import java.util.Collection;
import java.util.HashSet;

public class ExercicioTesteDeBancoComHashCodeEEquals {

	public static void main(String[] args) {
		Collection<Conta> contas = new HashSet<>();

		Conta contaCorrente1 = new ContaCorrente();
		contaCorrente1.setNumero(123);
		contaCorrente1.setCliente("Joãozinho");
		contaCorrente1.depositar(200);

		Conta contaCorrente2 = new ContaCorrente();
		contaCorrente2.setNumero(123);
		contaCorrente2.setCliente("Joãozinho");
		contaCorrente2.depositar(200);

		contas.add(contaCorrente1);
		contas.add(contaCorrente2);

		for (Conta conta : contas) {
			System.out.println(conta.getNumero() + " - " + conta.getCliente() + 
					" Saldo é de R$" + conta.getSaldo());
		}
	}

}
