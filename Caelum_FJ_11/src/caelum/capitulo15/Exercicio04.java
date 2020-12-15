package caelum.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio04 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		String linha = bufferedReader.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
	}

}
