package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.print("Entre com valor da posição " + i + " = ");
			vetA[i] = input.nextInt();
			
			vetB[i] = vetA[i] * i;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor  = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
	}

}
