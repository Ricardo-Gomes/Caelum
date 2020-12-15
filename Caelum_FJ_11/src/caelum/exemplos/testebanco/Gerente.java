package caelum.exemplos.testebanco;

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}
