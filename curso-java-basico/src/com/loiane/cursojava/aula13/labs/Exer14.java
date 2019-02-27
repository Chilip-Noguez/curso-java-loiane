package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite tamanho do arquivo para download: ");
		double tamanhoDwonload = input.nextDouble();
		
		System.out.println("Digite a velcidade do link: ");
		double speed = input.nextDouble();
		
		double tempo = tamanhoDwonload / speed;
		
		System.out.println("O tempo aprox. de download é: " + tempo);
		
		
	}

}
