package br.com.trilha.java.cursoIII.banco.seguro;

import br.com.trilha.java.cursoIII.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

}
