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
		System.out.println("A cor da porta �: " + this.cor);
	}

	boolean estadoDaPorta() {
		if (this.portaAberta == true) {
			System.out.println("Est� aberta");
			return true;
		} else {
			System.out.println("Est� fechada");
			return false;
		}
	}

}
