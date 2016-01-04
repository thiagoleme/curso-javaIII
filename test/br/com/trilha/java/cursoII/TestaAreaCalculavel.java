package br.com.trilha.java.cursoII;

public class TestaAreaCalculavel {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel a2 = new Circulo(2);
		System.out.println(a2.calculaArea());
	}
}
