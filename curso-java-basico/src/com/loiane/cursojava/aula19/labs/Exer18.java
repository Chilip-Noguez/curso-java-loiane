package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] idade = new int[10];
		
		
		
		for(int i=0; i<idade.length; i++) {
			System.out.println("Entre com a idade da pessoa - " + (i+1));
			idade[i] = input.nextInt();				
		}
		
		int menor = idade[0];
		int	maior = idade[0];
		int indexMaior = 0;
		int indexMenor = 0;
		for(int i=1; i<idade.length; i++) {
			if(idade[i] > maior) {
				maior = idade[i];
				indexMaior = i;
			} else if(idade[i] < menor) {
				menor = idade[i];
				indexMenor = i;
			}
		}
		
		System.out.print("Vetor de idades = ");
		for(int i=0; i<idade.length; i++) {
			System.out.print(idade[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Idade menor = " + menor);
		System.out.println("Indíce menor idade = " + indexMenor);
		System.out.println("Idade maior = " + maior);
		System.out.println("Indíce maior idade = " + indexMaior);
	}

}
/*DEBUGAR com declaração das variaveis
int menor = idade[0];
int	maior = idade[0];
int indexMaior = 0;
int indexMenor = 0;
antes da entrada de dados:
for(int i=0; i<idade.length; i++) {
			System.out.println("Entre com a idade da pessoa - " + (i+1));
			idade[i] = input.nextInt();				
		}
*/
