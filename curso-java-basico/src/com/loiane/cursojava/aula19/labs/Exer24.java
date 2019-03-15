package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o n�mero para posi��o " + i);
			vetorA[i] = input.nextInt();
		}
		
		/**
		 * vetorA.length/2 -> como esta sendo comparado o 1� n� pelo ultimo
		 * foi feita a divis�o, pq n�o h� necessidade de continuar ate o fim.
		 * 
		 * [vetorA.length -1 -i] -> esse trecho retorna o tamanho do vetorA,
		 *que no caso � 10, que � subtraido -1 e - i 
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
			System.out.println("N�o � Palindromo");
		}
		
		
	}

}
