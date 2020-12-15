package caelum.exemplos.testebanco;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String dataFormatada() {
		return this.dia + " | " + this.mes + " | " + this.ano;
	}

	public boolean validarData() {
		// realizar a verifica��o se � com 31 dias
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
				|| this.mes == 12) {
			if (this.dia > 0 && this.dia <= 31 && this.ano > 0) {
				return true;
			} else
				return false;
			// realizar a verifica��o se � com 30 dias
		} else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			if (this.dia > 0 && this.dia <= 30 && this.ano > 0) {
				return true;
			} else
				return false;
			// realizar a verifica��o se � bissexto
		} else if (this.dia > 0 && this.mes == 2 && this.ano > 0) {
			if ((this.ano % 4 == 0 && this.ano % 100 != 0 && this.dia <= 29 && this.dia != 0)
					|| (this.ano % 400 == 0 && this.dia <= 29 && this.dia != 0)) {
				return true;
				// realizar a verifica��o se n�o � bissexto
			} else if (this.dia <= 28 && this.dia != 0) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}

