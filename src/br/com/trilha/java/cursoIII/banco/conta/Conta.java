package br.com.trilha.java.cursoIII.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nome;

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
		return nome;
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
		String descr = "*** " + this.getClass().getSimpleName() + " ***";
		descr += "\n Nome: " + this.getNome();
		descr += "\n Número: " + this.getNumero();
		descr += "\n Saldo: R$" + this.getSaldo();
		return descr;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			throw new ClassCastException();
		}

		Conta outraConta = (Conta) obj;
		return (this.getNumero() == outraConta.getNumero() && this.getNome() == outraConta.getNome());
	}

	public int getNumero() {
		return numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
