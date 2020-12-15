package caelum.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacaoComArrayList {

	public static void main(String[] args) {
		List<ContaPoupanca> contasPoupanca = new ArrayList<>();

		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		contaPoupanca1.setNumero(1973);
		contasPoupanca.add(contaPoupanca1);

		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setNumero(1462);
		contasPoupanca.add(contaPoupanca2);

		ContaPoupanca contaPoupanca3 = new ContaPoupanca();
		contaPoupanca3.setNumero(1854);
		contasPoupanca.add(contaPoupanca3);

		Collections.sort(contasPoupanca);

		for (int i = 0; i < contasPoupanca.size(); i++) {
			System.out.println("Número da conta : " + contasPoupanca.get(i).getNumero());
		}
	}

}
