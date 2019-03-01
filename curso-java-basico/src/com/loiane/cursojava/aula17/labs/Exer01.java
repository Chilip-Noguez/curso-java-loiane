package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com a nota: ");
			double nota = input.nextDouble();
		
			if (nota>=0 && nota<=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				//notaValida = false;
				System.out.println("Valor inválido, insira novamente");
			
			} 
		}while (!notaValida);
		
		
	}

}
