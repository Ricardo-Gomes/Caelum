package caelum.capitulo14;

public class Exercicio02 {

	public static void main(String[] args) {
		String string1 = "Curso de Java";
		String string2 = "Java";
		System.out.println("A String se encontra dentro da outra ? -> " + string1.contains(string2));
		System.out.println("Quantos caracteres tem a string1 -> " + string1.length());

		String string3 = "Java ";
		System.out.println("Retirar os espaços em branco da String -> " + string3.trim());

		String string4 = "";
		System.out.println("Verificar se a String está vazia -> " + string4.isEmpty());
	}
}
