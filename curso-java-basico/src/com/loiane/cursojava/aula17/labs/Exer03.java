package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean infoValida = false;
		
		do {
			System.out.println("Entre com seu nome (min 3 caracteres).");
			nome = input.next();
			if (nome.length()>3) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Mínimo de 3 caracteres, insira novamente");
			} } while(!infoValida);
		
		infoValida = false;
		do {	
			System.out.println("Entre com sua idade: ");
			idade = input.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Idade entre 0 e 150 anos, insira novamente.");
			} } while(!infoValida);
		
		infoValida = false;
		do {	
			System.out.println("Entre seu salário: ");
			salario = input.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Salário deve ser maior que 0, insira novamente. ");
			} } while(!infoValida);
		
		infoValida = false;
		do {	
			System.out.println("Entre com seu sexo F ou M: ");
			sexo = input.next();
			
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Opção inválida, digite novamente:");
			} } while(!infoValida);
			
		
		System.out.println("As seguintes infos foram coletadas.");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		
		
	}

}
