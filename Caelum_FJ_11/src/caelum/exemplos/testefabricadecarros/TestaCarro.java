package caelum.exemplos.testefabricadecarros;

public class TestaCarro {

	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.ligar();
		
		meuCarro.acelerar(20);
		System.out.println(meuCarro.velocidadeAtual);
	}

}
