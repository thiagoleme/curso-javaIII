package br.com.trilha.java.cursoIII.banco.sistema;

import br.com.trilha.java.cursoIII.banco.interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel: " + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
		
	}
}
