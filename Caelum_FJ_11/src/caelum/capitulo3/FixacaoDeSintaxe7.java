package caelum.capitulo3;

//Escreva um programa que, dada uma vari�vel x com algum valor inteiro
public class FixacaoDeSintaxe7 {

	public static void main(String[] args) {
		int x = 13;
        
		while(x != 1) {
			
			if(x % 2 == 0) {
				x = x / 2;
			}else {
				x = 3 * x + 1;
			}

			System.out.print(x + " | ");
		}

	}

}
