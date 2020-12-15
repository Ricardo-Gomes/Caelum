package caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioBancoComMap {
	List<Conta> contas = new ArrayList<>();
	Map<String, Conta> mapaDeContas = new HashMap<>();
	
	public void adicionar(Conta conta) {
		this.contas.add(conta);
		this.mapaDeContas.put(conta.getCliente(), conta);
	}
	
	public Conta contagem(int x) {
		return this.contas.get(x);
	}
	
	public int contagemDeQuantidadeDecontas() {
		return this.contas.size();
	}
	
	public Conta buscarPorCliente(String nome) {
		return this.mapaDeContas.get(nome);
	}

}
