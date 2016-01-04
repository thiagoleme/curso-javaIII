package br.com.trilha.java.cursoIII.banco;

import br.com.trilha.java.cursoIII.banco.conta.ContaCorrente;
import br.com.trilha.java.cursoIII.banco.interfaces.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		
	}
}
