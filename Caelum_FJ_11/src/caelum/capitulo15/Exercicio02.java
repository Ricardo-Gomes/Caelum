package caelum.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new FileInputStream("arquivo.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String linha = bufferedReader.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
	}

}
