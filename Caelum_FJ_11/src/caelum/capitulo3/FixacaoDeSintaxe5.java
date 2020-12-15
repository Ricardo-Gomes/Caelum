package caelum.capitulo3;
/*No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até
20, 30, 40. */
public class FixacaoDeSintaxe5 {

	public static void main(String[] args) {
	long fatorial = 1;
		
	for (int i = 1; i <= 40; i++) {
		fatorial*=i;
		System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
	}

}
