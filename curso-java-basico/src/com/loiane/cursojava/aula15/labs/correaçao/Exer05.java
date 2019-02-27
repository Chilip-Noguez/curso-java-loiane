package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <10 ) {
			System.out.println("Aprovado, a média foi: " + media);
		} else if (media < 7) {
			System.out.println("Reprovado, a média foi: " + media);
		} else if (media == 10) {
			System.out.println("Aprovado com distinção, com média: ");
		}
		
	}//23:42

}
