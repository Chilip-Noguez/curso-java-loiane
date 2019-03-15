package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] vetA = new int[5];
		int[] vetB = new int[vetA.length];
		
		for (int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetA[i] = input.nextInt();
			
			vetB[i] = vetA[i]; //***
		}
		
		// outra forma de atribuir os valores***
		/*for (int i=0; i<vetA.length; i++) {
			vetB[i] = vetA[i];
		} */
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		System.out.println();
		
		//teste
		for (double vetC : vetB) {
			System.out.println(vetC);
		}
	}

}
