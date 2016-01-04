package br.com.trilha.java.cursoIII.banco.conta;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double deposito) {
		if (deposito > 0) {
			this.saldo += deposito;
		} else {
			throw new ValorInvalidoException(deposito);
		}
	}

	public void saca(double saque) {
		this.saldo -= saque;
	}

	public abstract void atualiza(double taxa);

}
