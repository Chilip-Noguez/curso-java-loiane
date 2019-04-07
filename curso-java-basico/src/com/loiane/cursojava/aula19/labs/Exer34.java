package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i ++) {
			System.out.println("Entre com o valor da posição - " + i);
			vetorA[i] = input.nextInt();
		}
				
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Analizando o número " + vetorA[i]);
			
			for(int j=1; j<vetorA[i]; j++) {
				if (j % 2 ==0) {
					System.out.println(j + " é par");
				} 
								
			}
			
			System.out.println();
			
		}
		
	}

}
