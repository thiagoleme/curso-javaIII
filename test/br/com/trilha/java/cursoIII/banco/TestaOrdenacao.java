package br.com.trilha.java.cursoIII.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import br.com.trilha.java.cursoIII.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	@Test
	public void OrdenarLista() {
		ContaPoupanca c1 = new ContaPoupanca(4);
		ContaPoupanca c2 = new ContaPoupanca(2);
		ContaPoupanca c3 = new ContaPoupanca(1);
		ContaPoupanca c4 = new ContaPoupanca(5);
		ContaPoupanca c5 = new ContaPoupanca(3);

		List<ContaPoupanca> lista = new ArrayList<>();		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
				
		Collections.sort(lista);
		
		assertEquals(1, lista.get(0).getNumero());
		assertEquals(2, lista.get(1).getNumero());
		assertEquals(3, lista.get(2).getNumero());
		assertEquals(4, lista.get(3).getNumero());
		assertEquals(5, lista.get(4).getNumero());
	}
}
