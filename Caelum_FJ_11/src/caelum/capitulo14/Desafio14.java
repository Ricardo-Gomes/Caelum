package caelum.capitulo14;

public class Desafio14 {

	public static void main(String[] args) {
		String string = "762";
		int numero = 0;
		int total = 0;
		
		for (int i = string.length()-1; i < 0; i--) {
			numero = Character.getNumericValue(string.charAt(i));
			int variavel = string.length()-1;
			while (variavel > 1) {
				numero = numero * 10;
				variavel--;
			}
			total = numero + total;
		}
		System.out.println(total);
	}

}
