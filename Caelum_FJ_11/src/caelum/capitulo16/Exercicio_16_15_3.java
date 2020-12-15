package caelum.capitulo16;

import java.util.HashMap;
import java.util.Map;

public class Exercicio_16_15_3 {

	public static void main(String[] args) {
		Conta conta1 = new ContaCorrente();
		conta1.depositar(10000);
		
		Conta conta2 = new ContaCorrente();
		conta2.depositar(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("Direção", conta1);
		mapaDeContas.put("Gerencia", conta2);
		
		Conta contaDaDirecao = mapaDeContas.get("Direção");
		System.out.println(contaDaDirecao.getSaldo());
	}

}
