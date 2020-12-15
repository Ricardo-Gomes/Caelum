package caelum.capitulo14;

public class Exercicio03 {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
//		if (x1 == x2) {
//			System.out.println("igual");
//		}else {
//			System.out.println("diferente");
//		}
		
		if(x1.equals(x2)) {
			System.out.println("igual");
		}else {
			System.out.println("diferente");
		}
		
		String string1 = "222";
		int i = Integer.parseInt(string1);
		System.out.println(i+1);
	}
}
