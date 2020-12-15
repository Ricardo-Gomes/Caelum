package caelum.capitulo4.fixandoconhecimento;

public class Questao1_1 {

	public static void main(String[] args) {
		Questao1 pessoa = new Questao1();

		pessoa.nome = "Joãozinho";
		pessoa.idade = 30;

		pessoa.fazAniversario();

		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
	}

}
