package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre a quantidade de notas:");
		int qtdNotas = input.nextInt();
		double nota = 0, media = 0;
		
		for(int i=1; i<=qtdNotas; i++) {
			System.out.println("Entre com a " + i + "º nota.");
			nota += input.nextDouble();
			
		}
		media = nota / qtdNotas;
		
		System.out.println(nota + (" ---- Média: ") + media);
	}

}
