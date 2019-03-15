package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número para posição " + i);
			vetorA[i] = input.nextInt();
		}
		
		/**
		 * vetorA.length/2 -> como esta sendo comparado o 1º nº pelo ultimo
		 * foi feita a divisão, pq não há necessidade de continuar ate o fim.
		 * 
		 * [vetorA.length -1 -i] -> esse trecho retorna o tamanho do vetorA,
		 *que no caso é 10, que é subtraido -1 e - i 
		 * 
		 * */
				
		boolean palindromo = true;
		for(int i=0; i<vetorA.length/2; i++) {
			if (vetorA[i] != vetorA[vetorA.length -1 -i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println();
		if (palindromo ) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é Palindromo");
		}
		
		
	}

}
