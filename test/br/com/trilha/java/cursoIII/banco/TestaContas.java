package br.com.trilha.java.cursoIII.banco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import br.com.trilha.java.cursoIII.banco.conta.Conta;
import br.com.trilha.java.cursoIII.banco.conta.ContaCorrente;
import br.com.trilha.java.cursoIII.banco.conta.ContaPoupanca;
import br.com.trilha.java.cursoIII.banco.conta.ValorInvalidoException;

public class TestaContas {

	@Test
	public void AtualizaContas() {
		Conta c = new ContaCorrente(1);
		Conta cc = new ContaCorrente(2);
		Conta cp = new ContaPoupanca(3);

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		assertEquals(c.getSaldo(), 1020.0, 0.00);
	}

	@Test(expected = ValorInvalidoException.class)
	public void NaoDepositaValorNegativo() {
		Conta cp = new ContaCorrente(111);
		cp.deposita(-100);
	}

	@Test
	public void ComparaComIgual() {
		Conta cc = new ContaCorrente(112);
		Conta cc2 = new ContaCorrente(112);

		assertEquals(cc, cc2);
	}

	@Test
	public void ComparaComEquals() {
		Conta cc = new ContaCorrente(11);
		cc.setNome("Teste 1");
		Conta cc2 = new ContaCorrente(11);
		cc2.setNome("Teste 1");
		assertTrue(cc.equals(cc2));
	}

	@Test
	public void NaoDeveAdicionarContasIguais() {
		Conta c1 = new ContaCorrente(1);
		Conta c2 = new ContaCorrente(2);
		Conta c3 = new ContaCorrente(3);
		Conta c4 = new ContaCorrente(5);
		Conta c5 = new ContaCorrente(2);
		Conta c6 = new ContaPoupanca(3);
		Conta c7 = new ContaPoupanca(4);
		Conta c8 = new ContaPoupanca(2);
		Conta c9 = new ContaPoupanca(3);

		Set<Conta> contas = new HashSet<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		contas.add(c7);
		contas.add(c8);
		contas.add(c9);

		assertEquals(7, contas.size());
	}
}
