package br.com.trilha.java.cursoIII.banco.conta;

import br.com.trilha.java.cursoIII.banco.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero) {
		super(numero);
	}

	public ContaCorrente() {
		super();
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
