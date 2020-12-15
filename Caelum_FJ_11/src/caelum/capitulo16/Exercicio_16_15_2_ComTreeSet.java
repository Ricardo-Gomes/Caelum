package caelum.capitulo16;

import java.util.TreeSet;

public class Exercicio_16_15_2_ComTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> lista = new TreeSet<>();
		
		lista.add(122);
		lista.add(245);
		lista.add(345);
		lista.add(453);
		lista.add(500);
		
		System.out.println("Menor número da lista: " + lista.first());
		System.out.println("--------------");
		System.out.println("Maior número da lista: " + lista.last());

	}

}
