package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de pessoas:");
		int qtdPessoas = input.nextInt();
		
		int idade = 0, soma = 0;
		int jovem = 0, adulto = 0, idoso = 0;
		
		for(int i =0; i<qtdPessoas; i++) {
			System.out.println("Entre com a " + (i+1) + "º idade ");
			idade = input.nextInt();
			
			soma += idade;
			
			if (idade >= 0 && idade <=25) {
				jovem++;
			} else if(idade >= 26 && idade <= 60) {
				adulto++;
			}else if(idade > 60){
				idoso++;
			}
			
		}
		int media = soma / qtdPessoas;
		
		
		
		System.out.println("Jovens: " + jovem);
		System.out.println("Adulto: " + adulto);
		System.out.println("Idoso: " + idoso);
		System.out.println("Média: " + media);
		
		if (media >= 0 && media <=25) {
			System.out.println("Jovens.");
		} else if(media >= 26 && media <= 60) {
			System.out.println("Adultos.");
		}else if(media > 60){
			System.out.println("Idosos.");
		}
		
		
	}

}
