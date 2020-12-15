package caelum.capitulo6.fabricadecarro;

public class FabricaDeCarro {

	public static FabricaDeCarro instancia;
	private int renault;
	private int chevrolet;
	private int fiat;
	private int volkswagen;

	protected FabricaDeCarro() {

	}

	public static FabricaDeCarro getIntancia() {
		if (instancia == null) {
			instancia = new FabricaDeCarro();
		}
		return instancia;
	}

	public int getRenault() {
		return renault;
	}

	public void setRenault(int renault) {
		this.renault = renault;
	}

	public int getChevrolet() {
		return chevrolet;
	}

	public void setChevrolet(int chevrolet) {
		this.chevrolet = chevrolet;
	}

	public int getFiat() {
		return fiat;
	}

	public void setFiat(int fiat) {
		this.fiat = fiat;
	}

	public int getVolkswagen() {
		return volkswagen;
	}

	public void setVolkswagen(int volkswagen) {
		this.volkswagen = volkswagen;
	}

	public String venderCarroDaRenault() {
		return new String("Carro Da Renault " + this.renault++ + " vendido.");
	}

	public String venderCarroDaChevrolet() {
		return new String("Carro Da Chevrolet " + this.chevrolet++ + " vendido.");
	}

	public String venderCarroDaFiat() {
		return new String("Carro Da Fiat " + this.fiat++ + " vendido.");
	}

	public String venderCarroDaVolkswagen() {
		return new String("Carro Da Volkswagen " + this.volkswagen++ + " vendido.");
	}

	public String geradorDeRelatorioDeEstoque() {
		return new String("Total de carros em estoque: Renault : " + this.renault + " | " + " Chevrolet : "
				+ this.chevrolet + " | " + " Fiat : " + this.fiat + " | " + " Volkswagen : " + this.volkswagen);
	}

}
