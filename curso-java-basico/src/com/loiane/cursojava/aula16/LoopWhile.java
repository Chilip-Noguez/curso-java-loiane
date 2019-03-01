package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; //count ou cont vari�veis utilizadas (nome) como contador (i � a mais utilizada).
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		//avalia a express�o se � verdadeira e executa
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; //igual: i = i+i; ou i+=i;
		}
		
		System.out.println(i); //valor de 11
		
		//executa o bloco de c�digo e depois avalia a express�o
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		System.out.println(i);
	}

}
