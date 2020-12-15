package caelum.capitulo3;

//Imprima os primeiros números da série de Fibonacci até passar de 100.
public class FixacaoDeSintaxe6 {

	public static void main(String[] args) {
		int contador1 = 0;
		int contador2 = 1;
		int resultado = 0;
		int contagem = 0;

		System.out.println(contador1);
		System.out.println(contador2);

		for (int i = 0; contagem < 8; i++) {
			resultado = contador2 + contador1;
			contador1 = contador2;
			contador2 = resultado;

			System.out.println(resultado);

			contagem = contagem + 1;
		}

	}

}
