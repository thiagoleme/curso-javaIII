package br.com.trilha.java.cursoIII.banco.sistema;

import br.com.trilha.java.cursoIII.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Atualizado: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

}
