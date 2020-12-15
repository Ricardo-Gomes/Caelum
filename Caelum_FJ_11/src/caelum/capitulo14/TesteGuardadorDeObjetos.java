package caelum.capitulo14;

import caelum.capitulo11.Conta;
import caelum.capitulo11.ContaCorrente;

public class TesteGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.depositar(180);
		guardadorDeObjetos.adicionarObjetos(contaCorrente);
		
		Object object1 = guardadorDeObjetos.pegarObjetos(0);
		
		Conta contaParaSerResgatada = (Conta) object1;
		
		System.out.println(contaParaSerResgatada.getSaldo());
		
		Object object2 = 1234;
		guardadorDeObjetos.adicionarObjetos(object2);
		System.out.println(guardadorDeObjetos.pegarObjetos(1));
		
	}

}
