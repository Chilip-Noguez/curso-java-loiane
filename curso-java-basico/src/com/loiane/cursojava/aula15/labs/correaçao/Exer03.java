package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com 'F' ou 'M: '");
		String letra = input.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - feminino. ");
		} else if (letra.equalsIgnoreCase("m")){
			System.out.println("M - masculino. ");
		} else {
			System.out.println("Sexo inv�lido. ");
		}
		
	}

} //11:52
