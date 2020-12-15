package caelum.capitulo16;

public class ExercicioTesteDeBanco {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(3000);
		
		ExercicioBanco contas = new ExercicioBanco();
		
		contas.adicionar(contaCorrente);
		contas.adicionar(contaPoupanca);
		
		System.out.println(contas.contagem(0));
		System.out.println("Total de Qunatidade de Contas: " + contas.contagemDeQuantidadeDecontas() );
	}

}
