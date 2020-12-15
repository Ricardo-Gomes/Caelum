package caelum.capitulo14;

import caelum.capitulo11.ContaCorrente;
import caelum.capitulo11.ContaPoupanca;

public class Exercicio07 {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaCorrente.setNumero(123);
		contaPoupanca.setNumero(123);
		
		System.out.println(contaCorrente.equals(contaPoupanca));
	}

}
