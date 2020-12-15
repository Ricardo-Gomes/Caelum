package caelum.exemplos.testebanco;

public class Funcionario{

	private int identificacao;
	private String nome;
	protected String cpf;
	private String rg;
	private String departamento;
	protected double salario;
	private Data dataDeAdmissao;
	private static int contadorDeFuncionarios;

	public Funcionario() {
		this.identificacao = ++Funcionario.contadorDeFuncionarios;
	}

	public Funcionario(String nome) {
		this.nome = nome;
		this.identificacao = ++Funcionario.contadorDeFuncionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Data dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public void receberAumento(double aumento) {
		this.salario += aumento;
	}

	public double calcularGanhoAnual() {
		return this.salario * 12;
	}

	void mostrar() {
		System.out.println("Identificador: " + this.identificacao);
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);

		if (this.dataDeAdmissao.validarData() == true) {
			System.out.println("Data da entrada: " + this.dataDeAdmissao.dataFormatada());
		} else {
			System.out.println("Atenção: A Data de Entrada " + this.dataDeAdmissao.dataFormatada() + " esta inválida!");
		}
		System.out.println("RG: " + this.rg);
		System.out.println("Salário atual: " + this.salario);
		System.out.println("Ganho anual: " + this.calcularGanhoAnual());

	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}

}
