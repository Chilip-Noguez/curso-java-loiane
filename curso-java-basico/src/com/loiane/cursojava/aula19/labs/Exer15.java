package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		double porcPar = 0, porcImpar = 0;
		int countPar = 0, countImpar = 0;
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posição " + i);
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetA.length; i++) {
			if(vetA[i] % 2 == 0) {
				countPar++;
			} else {
				countImpar++;
			}
		}
		
		System.out.print("Vetot A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		
		porcPar = (countPar * 100) / vetA.length;
		porcImpar = 100 - porcPar;
		//porcImpar = (countImpar * 100) / vetA.length;
		
		System.out.println("Porcentagem de pares: " + porcPar);
		
		System.out.println("Porcentagem de impares: " + porcImpar);
		
		
	}

}
