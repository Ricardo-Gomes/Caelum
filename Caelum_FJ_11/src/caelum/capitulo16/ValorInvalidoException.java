package caelum.capitulo16;

public class ValorInvalidoException extends RuntimeException {

	ValorInvalidoException(double valor){
		super("Valor inválido: " + valor);
	}
}
