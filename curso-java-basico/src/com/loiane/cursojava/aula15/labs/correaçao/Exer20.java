package com.loiane.cursojava.aula15.labs.correa�ao;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Telefonou para v�timia? ");
		String resp1 = input.next();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = input.next();
		
		System.out.println("Mora perto v�timia? ");
		String resp3 = input.next();
		
		System.out.println("Ja trabalhou com a  v�timia? ");
		String resp4 = input.next();
		
		System.out.println("Devia para a v�timia? ");
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
			System.out.println("C�mplice.");
		} else if (cont == 5) {
			System.out.println("Assassino");
		} else if (cont == 0) {
			System.out.println("Inocente");
		}
			
		
	}

}
