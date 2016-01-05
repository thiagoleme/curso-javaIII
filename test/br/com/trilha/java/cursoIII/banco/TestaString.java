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

		String caracter = "Teste impressão por caracter!";
		TestaString.imprimeCaracteres(caracter);

		String inverter = "Socorram-me, subi no ônibus em Marrocos";
		TestaString.imprimeInvertido(inverter);

		String inverter2 = "anotaram a data da maratona";
		TestaString.imprimeInvertido(inverter2);
		
		TestaString.imprimePalavrasInvertidas(inverter);
	}

	private static void imprimePalavrasInvertidas(String inverter) {
		String[] split = inverter.split(" ");
		for (int i = split.length - 1; i >= 0 ; i--) {
			System.out.print(split[i] + " ");
		}
		System.out.println();
	}

	private static void imprimeInvertido(String inverter) {
		for (int i = inverter.length() - 1; i >= 0; i--) {
			System.out.print(inverter.charAt(i));
		}
		System.out.println();
	}

	private static void imprimeCaracteres(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}
}
