package caelum.capitulo14;

import caelum.capitulo11.ContaCorrente;

public class Exercicio09 {

	public static void main(String[] args) {
	
		ContaCorrente contaCorrente1 = new ContaCorrente();
		ContaCorrente contaCorrente2 = new ContaCorrente();
		
		contaCorrente1.setNumero(123);
		contaCorrente1.setCliente("Jo�zinho");
		
		contaCorrente2.setNumero(123);
		contaCorrente2.setCliente("Jo�zinho");
		
		System.out.println(contaCorrente1.equals(contaCorrente2));
		

	}

}
