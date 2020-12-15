package caelum.capitulo6;

public class Empresa {

	private String nomeEmpresa;
	private Funcionario[] arrayFuncionarios;
	private String cnpj;

	public Empresa(int quantidadeDeFuncionarios) {
		this.arrayFuncionarios = new Funcionario[quantidadeDeFuncionarios];
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Funcionario getFuncionarios(int posicaoDoFuncionario) {
		return this.arrayFuncionarios[posicaoDoFuncionario];
	}
	
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
			System.out.println("Realocando novo funcionário: " + funcionario.getNome());
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
			arrayFuncionarios[i].mostrar();
		}
	}

	boolean trabalhaNaEmpresa(Funcionario funcionario) {
		for (int i = 0; i < arrayFuncionarios.length; i++) {
			if (arrayFuncionarios[i] == funcionario) {
				System.out.println(funcionario.getNome() + " Trabalha na empresa " + this.nomeEmpresa);
				return true;
			}
		}
		System.out.println(funcionario.getNome() + " Não trabalha na empresa " + this.nomeEmpresa);
		return false;
	}

}
