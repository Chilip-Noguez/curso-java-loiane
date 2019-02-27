package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota para calcular a média: ");
		double n1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota para calcular a média: ");
		double n2 = input.nextDouble();

		System.out.println("Digite a terceira nota para calcular a média: ");
		double n3 = input.nextDouble();

		System.out.println("Digite a quarta nota para calcular a média: ");
		double n4 = input.nextDouble();

		double media = (n1 + n2 + n3 + n4) /4;
		
		System.out.println("A média das notas foi: " + media);
		
	}

}
