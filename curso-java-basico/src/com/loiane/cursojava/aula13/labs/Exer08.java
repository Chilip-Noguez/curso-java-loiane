package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora: ");
		double valorHora = input.nextDouble();
		
		System.out.println("Digite sua carga hor�ria: ");
		double cargaHora = input.nextDouble();
		
		double salario = valorHora * cargaHora;
		
		System.out.println("O sal�rio �: " + salario);
		
		
		
	}

}
