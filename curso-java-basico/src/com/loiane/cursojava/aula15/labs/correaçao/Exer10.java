package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu turno: ");
		System.out.println("M - Matutino, V - Vespertino, N - Noturno.");
		
		String turno = input.next();
		
		/*if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!!");
		}*/
		
		switch (turno) {
		case "m": System.out.println("Bom dia!");
		case "M": System.out.println("Bom dia!"); break;
		case "v": System.out.println("Boa tarde!"); 
		case "V": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!");	
		case "n": System.out.println("Boa noite!");	break;

		default: System.out.println("Inválido!");
			break;
		}
		
	}

}
