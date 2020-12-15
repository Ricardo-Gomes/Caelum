package caelum.capitulo14;

public class Exercicio12 {
	public static void main(String[] args) {
		String string1 = "Socorram-me, subi no ônibus em Marrocos";
		for (int i = string1.length() - 1; i >= 0; i--) {
			System.out.print(string1.charAt(i));
		}
	}
}
