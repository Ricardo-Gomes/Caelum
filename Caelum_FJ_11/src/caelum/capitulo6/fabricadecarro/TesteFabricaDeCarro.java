package caelum.capitulo6.fabricadecarro;

public class TesteFabricaDeCarro {

	public static void main(String[] args) {
		FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getIntancia();
		
		System.out.println(fabricaDeCarro.venderCarroDaChevrolet());
		System.out.println(fabricaDeCarro.venderCarroDaFiat());
		System.out.println(fabricaDeCarro.venderCarroDaRenault());
		System.out.println(fabricaDeCarro.venderCarroDaVolkswagen());
		
		System.out.println(fabricaDeCarro.geradorDeRelatorioDeEstoque());
	}

}
