package br.com.trilha.java.cursoIII.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<Conta> {

	public ContaPoupanca(int numero) {
		super(numero);
	}

	public ContaPoupanca() {
		super();
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(Conta o) {
		return this.getNumero() - o.getNumero();
	}
}
