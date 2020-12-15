package caelum.capitulo10;

public class TesteGerenciadorDeImpostos {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida seguroDeVida = new SeguroDeVida();
		gerenciadorDeImpostoDeRenda.adicionar(seguroDeVida);

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		gerenciadorDeImpostoDeRenda.adicionar(contaCorrente);

		System.out.println(gerenciadorDeImpostoDeRenda.getTotal());
		System.out.println("O saldo é:" + contaCorrente.getSaldo());

	}
}
