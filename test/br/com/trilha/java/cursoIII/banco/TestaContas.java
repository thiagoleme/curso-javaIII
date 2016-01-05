package br.com.trilha.java.cursoIII.banco;

import org.junit.Test;

import br.com.trilha.java.cursoIII.banco.conta.Conta;
import br.com.trilha.java.cursoIII.banco.conta.ContaCorrente;
import br.com.trilha.java.cursoIII.banco.conta.ContaPoupanca;
import br.com.trilha.java.cursoIII.banco.conta.ValorInvalidoException;

import static org.junit.Assert.*;

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

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

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
	public void ComparaComEquals(){
		Conta cc = new ContaCorrente(11);
		cc.setNome("Teste 1");
		Conta cc2 = new ContaCorrente(11);
		cc2.setNome("Teste 1");
		assertTrue(cc.equals(cc2));
	}
}
