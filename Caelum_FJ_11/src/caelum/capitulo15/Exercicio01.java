package caelum.capitulo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println("arquivo.txt");
		String linha = bufferedReader.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();		
	}

}
