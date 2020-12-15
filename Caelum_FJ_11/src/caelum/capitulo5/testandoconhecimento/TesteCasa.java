package caelum.capitulo5.testandoconhecimento;

public class TesteCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();

		casa.pintar("Verde");
		System.out.println("A cor da casa é: " + casa.cor);

		System.out.println("--------------------");

		casa.portas = new Porta[2];

		for (int i = 0; i < casa.portas.length; i++) {
			casa.adicionarPorta(casa.portas[i]);
		}

		System.out.println("O total de portas na casa é: " + casa.totalDePortas());

		System.out.println("--------------------");

		Porta portaEntrada = new Porta();
		Porta portaSaida = new Porta();
		
		casa.portas[0] = portaEntrada;
		casa.portas[1] = portaSaida;
		
		casa.portas[0].fecharPorta();
		casa.portas[1].abrirPorta();
		
		System.out.println("O total de portas abertas é: " + casa.quantidadeDePortasAbertas());

	}

}
