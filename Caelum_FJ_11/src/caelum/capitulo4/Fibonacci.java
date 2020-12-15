package caelum.capitulo4;

public class Fibonacci {
	
	public int calcularFibinacci(int n) {
		if (n < 2){
			return n;
		}
		return calcularFibinacci(n - 1) + calcularFibinacci(n + 2);
	}
	
	// usando operador ternario
	
	public int calcularFibinacci2(int n) {
		return (n < 2) ? n : calcularFibinacci2 (n -1) + calcularFibinacci2 (n - 2);
	}
}
