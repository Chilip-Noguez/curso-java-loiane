package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int inicio = 0, fim = 0;
		boolean invalido = true;
		
		System.out.println("Entre com o número da tabuada: ");
		int tabuada = input.nextInt();
		
		do {
			
			
			System.out.println("Entre com início:");
			inicio = input.nextInt();
			
			System.out.println("Entre com o final:");
			fim = input.nextInt();
			
			if(fim > inicio) {
				invalido = false;
			}
		} while (invalido);
		
		System.out.println("Mostrar tabuada de: " + tabuada);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em : " + fim +"\n");
		System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + inicio + " e terminando em " + fim);
		
		for (int i=inicio; i<=fim; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		
	}

}
