package caelum.capitulo4.fixandoconhecimento;

public class Questao3 {

	String cor;
	Questao2 porta1;
	Questao2 porta2;
	Questao2 porta3;

	void pinta(String s) {
		this.cor = s;
	}

	int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		if (porta1.aberta == true && porta2.aberta == true && porta3.aberta == true) {
			return portasAbertas = 3;
		} else if ((porta1.aberta == true && porta2.aberta == true && porta3.aberta == false)
				|| (porta1.aberta == true && porta2.aberta == false && porta3.aberta == true)
				|| (porta1.aberta == false && porta2.aberta == true && porta3.aberta == true)) {
			return portasAbertas = 2;
		} else if ((porta1.aberta == true && porta2.aberta == false && porta3.aberta == false)
				|| (porta1.aberta == false && porta2.aberta == true && porta3.aberta == false)
				|| (porta1.aberta == false && porta2.aberta == false && porta3.aberta == true)) {
			return portasAbertas = 1;
		} else {
			return portasAbertas;
		}
	}
	


}
