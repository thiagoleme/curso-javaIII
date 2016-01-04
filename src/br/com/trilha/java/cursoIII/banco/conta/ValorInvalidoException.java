package br.com.trilha.java.cursoIII.banco.conta;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException(double valor) {
		super("Valor Inválido: " + valor);
	}

}
