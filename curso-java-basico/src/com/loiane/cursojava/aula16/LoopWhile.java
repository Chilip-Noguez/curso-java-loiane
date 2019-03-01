package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; //count ou cont variáveis utilizadas (nome) como contador (i é a mais utilizada).
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		//avalia a expressão se é verdadeira e executa
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; //igual: i = i+i; ou i+=i;
		}
		
		System.out.println(i); //valor de 11
		
		//executa o bloco de código e depois avalia a expressão
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		System.out.println(i);
	}

}
