package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número para posição " + i);
			vetorA[i] = input.nextInt();
							
			/*if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}*/
			/*pode ser feito com operador ternário:
			 * vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			 * vetorA recebe o primeiro operando -> (vetorA[i] % 2 == 0)
			 * ? igual ao IF, o segundo operando (nesse caso o 1)
			 * :igual senão e o terceiro operando(nessa caso 0).
			 * */
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}
		
		System.out.print("Vetor A =");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
