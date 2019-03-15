package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posicação " + 1);
			vetA[i] = input.nextInt();
			
			vetB[i] = vetA[i] % 2;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
	}

}
