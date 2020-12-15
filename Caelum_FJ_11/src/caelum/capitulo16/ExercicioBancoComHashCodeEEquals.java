package caelum.capitulo16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioBancoComHashCodeEEquals {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contas == null) ? 0 : contas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExercicioBancoComHashCodeEEquals other = (ExercicioBancoComHashCodeEEquals) obj;
		if (contas == null) {
			if (other.contas != null)
				return false;
		} else if (!contas.equals(other.contas))
			return false;
		return true;
	}

	
}
