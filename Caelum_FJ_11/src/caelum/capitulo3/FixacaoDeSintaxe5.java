package caelum.capitulo3;
/*No c�digo do exerc�cio anterior, aumente a quantidade de n�meros que ter�o os fatoriais impressos, at�
20, 30, 40. */
public class FixacaoDeSintaxe5 {

	public static void main(String[] args) {
	long fatorial = 1;
		
	for (int i = 1; i <= 40; i++) {
		fatorial*=i;
		System.out.println("O fatorial de " + i + " �: " + fatorial);
		}
	}

}
