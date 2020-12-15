package caelum.capitulo5;

public class Empresa {

	String nomeEmpresa;
	Funcionario[] arrayFuncionarios;
	String cnpj;

	void adicionar(Funcionario funcionario) {
		boolean arrayCompleto = true;
		for (int i = 0; i < arrayFuncionarios.length; i++) {
			if (arrayFuncionarios[i] == null) {
				arrayCompleto = false;
				break;
			}
			if (arrayFuncionarios[arrayFuncionarios.length - 1] != null) {
				System.out.println("Todas as vagas já foram preenchidas!");
				break;
			}
		}
		if (arrayCompleto) {
			System.out.println("Realocando novo funcionário: " + funcionario.nome);
			Funcionario[] arrayFuncionariosComExtensao = new Funcionario[this.arrayFuncionarios.length + 1];
			for (int i = 0; i < this.arrayFuncionarios.length; i++) {
				arrayFuncionariosComExtensao[i] = arrayFuncionarios[i];
			}
			arrayFuncionariosComExtensao[this.arrayFuncionarios.length] = funcionario;
			arrayFuncionarios = arrayFuncionariosComExtensao;
		}
	}

	void mostrarFuncionarios() {
		for (int i = 0; i < arrayFuncionarios.length; i++) {
			if (arrayFuncionarios[i] != null) {
				System.out.println("Funcionario " + (i + 1));
				System.out.println("Salario inicial = " + arrayFuncionarios[i].salario);
				System.out.println("Funcionário na posição: " + i);
			} else
				break;
		}
	}

	boolean trabalhaNaEmpresa(Funcionario funcionario) {
		for (int i = 0; i < arrayFuncionarios.length; i++) {
			if (arrayFuncionarios[i] == funcionario) {
				System.out.println(funcionario.nome + " Trabalha na empresa " + this.nomeEmpresa);
				return true;
			}
		}
		System.out.println(funcionario.nome + " Não trabalha na empresa " + this.nomeEmpresa);
		return false;
	}

}
