package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int menor = 0, igual = 0, maior = 0, qtdMaior = 0;
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posição " + i);
			vetA[i] = input.nextInt();
			
			if(vetA[i] < 15) {
				menor += vetA[i];
			} else if (vetA[i] == 15) {
				igual++;
			} else {
				maior += vetA[i];
				qtdMaior++;
			}
			
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("Somar menor de 15 = " + menor);
		
		System.out.println("Igual a 15 = " + igual);
		
		System.out.println("Media maior de 15 = " + (maior / qtdMaior));
		
		
	}

}
