package caelum.exemplos.testefabricadecarros;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;

	void ligar() {
		System.out.println("O carro está ligado");
	}

	void acelerar(double velocidade) {
		double velocidadeNova = this.velocidadeAtual + velocidade;
		this.velocidadeAtual = velocidadeNova;
	}

	int trocarMarcha() {

		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
