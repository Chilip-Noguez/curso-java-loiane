package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] vetA = new int[8];
		int[] vetB = new int[vetA.length];
		
		for (int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetA[i] = input.nextInt();
		}
		
		for (int i=0; i<vetA.length; i++) {
			vetB[i] = vetA[i] * 2;
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
	}

}
