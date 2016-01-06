package br.com.trilha.java.cursoIII.banco.sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.trilha.java.cursoIII.banco.conta.Conta;

public class Banco {
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();

	public void add(Conta c) {
		contas.add(c);
		indexadoPorNome.put(c.getNome(), c);
	}

	public Conta get(int i) {
		return contas.get(i);
	}

	public int totalContas() {
		return contas.size();
	}

	public Conta buscaPorNome(String nome) {
		return indexadoPorNome.get(nome);
	}

}
