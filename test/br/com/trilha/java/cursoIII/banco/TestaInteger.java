package br.com.trilha.java.cursoIII.banco;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		
		String valida = "2110";
		int num = Integer.parseInt(valida);
		System.out.println(num);
		
		String invalida = "21/10";
		int num2 = Integer.parseInt(invalida);
		System.out.println(num2);
		
	}
}
