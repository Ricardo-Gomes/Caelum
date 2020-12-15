package caelum.capitulo15;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("arquivo.txt");
        Scanner scanner = new Scanner(inputStream);
		OutputStream outputStream = new FileOutputStream("saida.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		while (scanner.hasNextLine()) {
			String scanner2 = scanner.nextLine();
			bufferedWriter.write(scanner2);
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		scanner.close();
	}

}
