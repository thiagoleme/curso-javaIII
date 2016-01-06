package br.com.trilha.java.cursoIII.banco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

import org.junit.Test;

import br.com.trilha.java.cursoIII.banco.conta.Conta;
import br.com.trilha.java.cursoIII.banco.conta.ContaCorrente;
import br.com.trilha.java.cursoIII.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	@Test
	public void OrdenarListaPorNome() {
		ContaPoupanca c1 = new ContaPoupanca(4);
		ContaPoupanca c2 = new ContaPoupanca(2);
		ContaPoupanca c3 = new ContaPoupanca(1);
		ContaPoupanca c4 = new ContaPoupanca(5);
		ContaPoupanca c5 = new ContaPoupanca(3);

		c1.setNome("C");
		c2.setNome("U");
		c3.setNome("K");
		c4.setNome("J");
		c5.setNome("B");

		List<ContaPoupanca> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);

		Collections.sort(lista);
		assertEquals("B", lista.get(0).getNome());
		assertEquals("C", lista.get(1).getNome());
		assertEquals("J", lista.get(2).getNome());
		assertEquals("K", lista.get(3).getNome());
		assertEquals("U", lista.get(4).getNome());
	}

	@Test
	public void OrdenarListaPorNumero() {
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

		Random random = new Random();
		for (ContaPoupanca contaPoupanca : lista) {
			contaPoupanca.deposita(2500 * random.nextDouble());
		}

		Collections.sort(lista);
		assertEquals(1, lista.get(0).getNumero());
		assertEquals(2, lista.get(1).getNumero());
		assertEquals(3, lista.get(2).getNumero());
		assertEquals(4, lista.get(3).getNumero());
		assertEquals(5, lista.get(4).getNumero());
	}

	@Test
	public void PerformanceComList() {
		System.out.println("Iniciando com List...");

		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();

		int total = 150000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		long incl = System.currentTimeMillis();
		long tempo = incl - inicio;
		System.out.println("Incluiu em: " + tempo);

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long pesq = System.currentTimeMillis();
		tempo = pesq - incl;
		System.out.println("Pesquisou em: " + tempo);

		long fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo total gasto: " + tempo);
	}

	@Test
	public void PerformanceComSet() {
		System.out.println("Iniciando com Set...");

		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();

		int total = 150000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		long incl = System.currentTimeMillis();
		long tempo = incl - inicio;
		System.out.println("Incluiu em: " + tempo);

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long pesq = System.currentTimeMillis();
		tempo = pesq - incl;
		System.out.println("Pesquisou em: " + tempo);

		long fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo total gasto: " + tempo);
	}

	@Test
	public void TestaMapa() {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);

		Conta c2 = new ContaCorrente();
		c2.deposita(3000);

		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// qual a conta do diretor?
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		assertEquals(10000, contaDoDiretor.getSaldo(), 0.00001);
	}

	@Test
	public void PerformanceAddPrimeiraPosicaoComList() {
		System.out.println("Iniciando Add na Primeira Posição...");
		long inicio = System.currentTimeMillis();

		// trocar depois por ArrayList
//		List<Integer> teste = new ArrayList<>();
		List<Integer> teste = new LinkedList<>();

		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}

		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}
	
	@Test
	public void OrdenarComTreeSet(){
		TreeSet<Integer> set = new TreeSet<>();
		int total = 1000;
		
		for (int i = 1; i <= total ; i++) {
			set.add(i);
		}
		
		//for (Integer i : set.descendingSet()) {
			//System.out.println(i.intValue());
		//}
	}
	
	@Test
	public void OrdenarComArrayList(){
		List<Integer> list = new ArrayList<>();
		int total = 1000;
		
		for (int i = 1; i <= total ; i++) {
			list.add(i);
		}

		Collections.reverse(list);
	}
}
