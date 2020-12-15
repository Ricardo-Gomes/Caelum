package caelum.capitulo5.desafiofibonacci;

public class Fibonacci {

	public int[] calcularFibonacci(int n) {
		int[] fibonacci = new int[n + 1];

		if (n == 0) {
			fibonacci[0] = 0;
			return fibonacci;
		} else if (n == 1) {
			fibonacci[0] = 1;
			return fibonacci;
		} else {
			fibonacci[1] = fibonacci[2] = 1;
			for (int i = 3; i <= n; i++) {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		}
		return fibonacci;

	}
}
