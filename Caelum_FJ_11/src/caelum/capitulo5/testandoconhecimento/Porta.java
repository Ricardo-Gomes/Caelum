package caelum.capitulo5.testandoconhecimento;

public class Porta {

	boolean portaAberta;
	String cor;
	double tamanhoX;
	double tamanhoY;
	double tamanhoZ;

	void abrirPorta() {
		this.portaAberta = true;
	}

	void fecharPorta() {
		this.portaAberta = false;
	}

	void pintar(String cores) {
		this.cor = cores;
		System.out.println("A cor da porta é: " + this.cor);
	}

	boolean estadoDaPorta() {
		if (this.portaAberta == true) {
			System.out.println("Está aberta");
			return true;
		} else {
			System.out.println("Está fechada");
			return false;
		}
	}

}
