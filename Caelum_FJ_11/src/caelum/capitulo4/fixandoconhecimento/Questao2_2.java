package caelum.capitulo4.fixandoconhecimento;

public class Questao2_2 {

	public static void main(String[] args) {
		Questao2 porta = new Questao2();
		
		porta.abre();
		
		porta.fecha();
		
		porta.abre();
		
		porta.dimensaoX = 2;
		
		porta.dimensaoY = 3;
		
		porta.dimensaoZ = 4;
		
		porta.pinta("Azul");
		
		porta.estaAberta();
	}

}
