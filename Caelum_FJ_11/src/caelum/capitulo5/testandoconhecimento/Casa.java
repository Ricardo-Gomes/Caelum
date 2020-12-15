package caelum.capitulo5.testandoconhecimento;

public class Casa {

	String cor;
	int quantidadesDePortas;
	Porta[] portas;

	void pintar(String cores) {
		this.cor = cores;
		System.out.println("A cor da casa é: " + this.cor);
	}

	int quantidadeDePortasAbertas() {
		int portasAbertas = 0;
		for (int i = 0; i < portas.length; i++) {
			if (portas[i].portaAberta == true) {
				portasAbertas += 1;
			}
		}
		return portasAbertas;
	}

	void adicionarPorta(Porta porta) {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = porta;
				break;
			}
		}
	}

	int totalDePortas() {
		return portas.length;
	}
}
