package br.com.trilha.java.cursoII;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException(double valor) {
		super("Valor Inválido: " + valor);
	}

}
