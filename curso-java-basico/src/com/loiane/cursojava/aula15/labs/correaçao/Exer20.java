package com.loiane.cursojava.aula15.labs.correaçao;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Telefonou para vítimia? ");
		String resp1 = input.next();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = input.next();
		
		System.out.println("Mora perto vítimia? ");
		String resp3 = input.next();
		
		System.out.println("Ja trabalhou com a  vítimia? ");
		String resp4 = input.next();
		
		System.out.println("Devia para a vítimia? ");
		String resp5 = input.next();
		
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("s")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("s")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("s")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("s")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("s")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita.");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice.");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else if (cont == 0) {
			System.out.println("Inocente");
		}
			
		
	}

}
