package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int par = 0 ;
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posição " + i);
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetA.length; i++) {
			if (vetA[i] % 2 ==0) {
				par++;
			}
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Qdt pares é: " + par);
		
	}

}
