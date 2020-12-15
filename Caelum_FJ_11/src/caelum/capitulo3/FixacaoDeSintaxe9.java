package caelum.capitulo3;

public class FixacaoDeSintaxe9 {

	public static void main(String[] args) {
		for (int fibonacci = 0, auxiliar = 1; fibonacci <= 100; auxiliar += fibonacci, fibonacci = auxiliar - fibonacci) {
			System.out.print(fibonacci + " | ");
		}
	}

}
