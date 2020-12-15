package caelum.capitulo10;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.depositar(1000);
		System.out.println(contaCorrente.calcularTributos());
		
		//Teste de polimorfismo
		Tributavel tributavel = contaCorrente;
		System.out.println(tributavel.calcularTributos());
	}

}
