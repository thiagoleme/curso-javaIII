package br.com.trilha.java.cursoII;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestaContas {

	@Test
	public void AtualizaContas() {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

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
		Conta cp = new ContaCorrente();
		cp.deposita(-100);
	}
}
