package caelum.capitulo5.desafiofibonacci;

public class TesteFibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int[] array = fibonacci.calcularFibonacci(8);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
	}

}
