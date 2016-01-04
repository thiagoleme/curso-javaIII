package br.com.trilha.java.cursoII;

public class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
