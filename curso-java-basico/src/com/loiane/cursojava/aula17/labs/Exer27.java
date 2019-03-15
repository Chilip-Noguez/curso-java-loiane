package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean sair = false;
		String continuar;
		double temperatura = 0, maior = 0, menor = 100, media = 0;
		int count = 0;
		
		
		do {
			sair = false;
			System.out.println("Entre com a temperatura: ");
			temperatura = input.nextDouble();
			
			if (temperatura> maior) {
				maior = temperatura;
			} else if (temperatura < menor){
				menor = temperatura;
			}
			
			media += temperatura;
			count++;
			
			System.out.println("Deseja sair S/N?");
			continuar = input.next();
			if (continuar.equalsIgnoreCase("s")) {
				sair = true;
			} else {
				sair = false;
			}
			
			
		} while (sair == !true);
		
		
		media = media / count;
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media);
		
	}

}
