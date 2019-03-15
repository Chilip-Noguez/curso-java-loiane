package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
				
			for(int i=0; i<vetorA.length; i++) {
				System.out.println("Entre com um número PAR: ");
				vetorA[i] = input.nextInt();
				
				if(vetorA[i] % 2 !=0) {
					break;
				} 
			}
		
			System.out.print("Vetor A = ");
			for(int i=0; i<vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
		
		
		
		
		
		}

}

