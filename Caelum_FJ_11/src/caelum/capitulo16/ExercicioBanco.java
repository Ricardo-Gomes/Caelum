package caelum.capitulo16;

import java.util.ArrayList;
import java.util.List;

public class ExercicioBanco {

	List<Conta> contas = new ArrayList<>();
	
	public void adicionar(Conta conta) {
		this.contas.add(conta);
	}
	
	public Conta contagem(int x) {
		return this.contas.get(x);
	}
	
	public int contagemDeQuantidadeDecontas() {
		return this.contas.size();
	}
}
