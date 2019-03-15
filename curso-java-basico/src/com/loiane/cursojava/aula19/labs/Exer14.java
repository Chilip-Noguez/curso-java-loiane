package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int count = 0, soma = 0, media = 0;
		
		int[] vetA = new int[10];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posição " + i);
			vetA[i] = input.nextInt();
			
			if(vetA[i] % 2 != 0) {
				soma += vetA[i];
				count++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] +" ");
		}
		
		media = soma / count;
		
		System.out.println();
		System.out.println("Soma é: " + soma);
		System.out.println("Media é: " + media);
		
	}

}
