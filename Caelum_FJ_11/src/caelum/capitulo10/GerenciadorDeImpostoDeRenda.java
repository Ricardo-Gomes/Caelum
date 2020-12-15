package caelum.capitulo10;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	public double getTotal() {
		return this.total;
	}

	public void adicionar(Tributavel tributavel) {
		System.out.println("Adicionando tributavel: " + tributavel);
		this.total += tributavel.calcularTributos();
	}

}
