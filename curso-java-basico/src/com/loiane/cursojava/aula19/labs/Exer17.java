package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] idades = new int[10];
		int maior35 = 0;
		
		
		for(int i=0; i<idades.length; i++ ) {
			System.out.println("Entre com a idade da pessoa  " + (i+1));
			idades[i] = input.nextInt();
			
			if(idades[i] > 35) {
				maior35++;
			}
		}
		
		System.out.println("Vetor de idades = ");
		for(int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Idade maior que 35 anos = " + maior35);
		
		
	}

}
