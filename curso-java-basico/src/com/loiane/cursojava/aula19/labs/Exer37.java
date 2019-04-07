package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para posição - " + i);
			vetorA[i] = input.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++) {
			
			vetorB[i] = 1;
			for (int j=1; j<=vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
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
