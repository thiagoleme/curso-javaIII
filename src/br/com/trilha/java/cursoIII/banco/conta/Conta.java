package br.com.trilha.java.cursoIII.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nomeDoCliente = "";

	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta() {
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nomeDoCliente;
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

	@Override
	public String toString() {
		String descr = "\n*** " + this.getClass().getSimpleName() + " ***";
		descr += "\n Nome: " + this.getNome();
		descr += "\n Numero: " + this.getNumero();
		descr += "\n Saldo: R$" + this.getSaldo();
		return descr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNome(String nome) {
		this.nomeDoCliente = nome;
	}
}
