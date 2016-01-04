package br.com.trilha.java.cursoII;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel: " + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
		
	}
}
