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
			
			System.out.println("Entre com um número para posição " + i);
			vetorB[i] = input.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else if(vetorA[i] % 2 !=0) {
				vetorB[i] = 0;
			}
		}
		
		
		
		
	}

}
