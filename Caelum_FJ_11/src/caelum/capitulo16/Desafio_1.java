package caelum.capitulo16;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Desafio_1 {

	public static void main(String[] args) {
		Set<Integer> lista = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i <= 1000; i++) {
			lista.add(i);
		}
		
		System.out.println(lista);
	}

}
