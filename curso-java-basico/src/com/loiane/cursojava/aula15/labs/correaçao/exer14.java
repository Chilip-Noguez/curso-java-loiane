package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua primeira nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Entre com sua segunda nota: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		String aproveitamento = "";	
		if (media >= 9 && media <=10) {
			aproveitamento = "A";
		} else if (media >= 7.5 && media <9) {
			aproveitamento = "B";
		} else if (media >= 6 && media <7.5) {
			aproveitamento = "C";
		} else if (media >= 4 && media < 6) {
			aproveitamento = "D";
		} else if (media < 4) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch (aproveitamento) {
		case "A":
		case "B":
		case "C": System.out.println("Aprovado!");break;
		case "D": 
		case "E": System.out.println("Reprovado!");break;
				
		}
		
	}

}
