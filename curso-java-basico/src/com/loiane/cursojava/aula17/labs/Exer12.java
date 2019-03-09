package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i = 1;
		
		System.out.println("Entre com um número para gerar tabuada:");
		int tabuada = input.nextInt();
		
		System.out.println("Tabuada de " + tabuada + ";");
		
		/*for(int i=1; i<=10; i++) {
		System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
	}
	
} */
	
		/*
		do {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			i++;
		} while(i<=10); 
		*/
		
		
		/*
		while (i <= 10) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			i++;
		}
		*/

}
}
