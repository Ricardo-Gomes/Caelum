package caelum.capitulo6;

public class Pessoa {
	private String cpf;

	public Pessoa(String cpf) {
		if (this.validarCpf(cpf) == true) {
			this.cpf = cpf;
			System.out.println("CPF validado");
		} else {
			System.out.println("CPF inválido");
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean validarCpf(String cpf) {
		if (cpf.length() != 11) {
			return false;
		}
		String digitosIniciaisDoCPF = cpf.substring(0, 9);
		return this.calcularDigitosDeVerificacaoDoCPF(digitosIniciaisDoCPF).equals(cpf.substring(9, 11));
	}

	private String calcularDigitosDeVerificacaoDoCPF(String digitos) {
		Integer primeiroDigito;
		Integer segundoDigito;
		int soma = 0;
		int digito = 10;

		for (int i = 0; i < digitos.length(); i++) {
			soma += Integer.parseInt(digitos.substring(i, i + 1)) * digito--;
		}
		if (soma % 11 == 0 || soma % 11 == 1) {
			primeiroDigito = new Integer(0);
		} else {
			primeiroDigito = new Integer(11 - (soma % 11));
		}

		soma = 0;
		digito = 11;

		for (int i = 0; i < digitos.length(); i++) {
			soma += Integer.parseInt(digitos.substring(i, i + 1)) * digito--;
		}
		soma += primeiroDigito.intValue() * 2;
		if (soma % 11 == 0 || soma % 11 == 1) {
			segundoDigito = new Integer(0);
		} else {
			segundoDigito = new Integer(11 - (soma % 11));
		}
		return primeiroDigito.toString() + segundoDigito.toString();
	}

}
