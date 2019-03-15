package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];
		
		for (int i=0; i<vetA.length; i++) {
			System.out.println("Entre com a posição " + i);
			vetA[i] = input.nextInt();
			
			vetB[i] = vetA[i] * vetA[i];
		}
		
		System.out.println("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
	}

}
