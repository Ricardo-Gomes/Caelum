package caelum.capitulo3;

//Imprima a seguinte tabela, usando fors encadeados.
public class FixacaoDeSintaxe8 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j);
			}
			System.out.println();
		}

	}
}
