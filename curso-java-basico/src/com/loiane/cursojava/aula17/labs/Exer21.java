package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int alunos = 0;
		int media = 0;
		int totalAlunos = 0;
		boolean validade = false;
		
		System.out.println("Entre com a quantidade de turmas: ");
		int turmas = input.nextInt();
		
		for(int i=0; i<turmas; i++) {
			
			validade = true;
			do {
				System.out.println("Entre com a quantidade de alunos desta turma: ");
				alunos = input.nextInt();
			
			
				if (alunos <= 40) {
					validade = false;
				} else {
					System.out.println("repita.");
				}
			} while(validade);
			
			totalAlunos += alunos;
		}
		media = totalAlunos / turmas;
		
		System.out.println("Média: " + media);
	}

}
