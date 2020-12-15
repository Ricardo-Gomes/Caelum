package caelum.capitulo4.fixandoconhecimento;

public class Questao3_1 {

	public static void main(String[] args) {
	Questao3 casa = new Questao3();
	Questao2 porta1 = new Questao2();
	Questao2 porta2 = new Questao2();
	Questao2 porta3 = new Questao2();
	
	casa.pinta("Branco");
	
	casa.porta1 = porta1;
	casa.porta2 = porta2;
	casa.porta3 = porta3;
	
	casa.porta1.abre();
	casa.porta2.abre();
	casa.porta1.fecha();
	casa.porta2.fecha();
	casa.porta3.abre();
	casa.porta1.abre();
	casa.porta2.abre();
	
	System.out.println("Quantidade de postas abertas na casa: " + casa.quantasPortasEstaoAbertas());
}

}
