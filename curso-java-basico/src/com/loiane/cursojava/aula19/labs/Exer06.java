package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posição " + i + " = ");
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetB.length; i++) {
			System.out.println("Entre com o valor do vetor B, posição " + i + " = ");
			vetB[i] = input.nextInt();
		}
		
		for(int i=0; i<vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		
		System.out.println();
		System.out.print("Vetor a = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
			
		}
		
		System.out.println();
		System.out.print("Vetor b = ");
		for(int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
			
		}
		
		System.out.println();
		System.out.print("Vetor c = ");
		for(int i=0; i<vetC.length; i++) {
			System.out.print(vetC[i] + " ");
			
		}
		
	}

}
