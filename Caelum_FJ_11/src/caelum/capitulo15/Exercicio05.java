package caelum.capitulo15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("arquivo.txt");
		
		Scanner scanner = new Scanner(inputStream);
		while (scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
		}
		inputStream.close();
	}

}
