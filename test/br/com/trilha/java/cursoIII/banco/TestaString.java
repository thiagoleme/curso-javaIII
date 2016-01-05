package br.com.trilha.java.cursoIII.banco;

import br.com.trilha.java.cursoIII.banco.conta.Conta;
import br.com.trilha.java.cursoIII.banco.conta.ContaCorrente;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
	    s.replaceAll("1", "2");
	    System.out.println(s);
	    
	    s = s.replaceAll("1", "2");
	    System.out.println(s);
	    
	    String contem = "Teste 1: - fj22";
	    System.out.println(contem.contains(s));
	    
	    String trim = "   Teste 2: - fj22   ";
	    System.out.println(trim);
	    System.out.println(trim.trim());
	    
	    System.out.println(trim.isEmpty());
	    
	    System.out.println(trim.length());
	    
	    Conta conta = new ContaCorrente();
	    conta.deposita(150);
	    System.out.println(conta);
	}
}
