package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CDs.");
		int qtdCd = input.nextInt();
		double valor = 0;
		double soma = 0;
		double media =0;
		
		for (int i=0; i<qtdCd; i++) {
			System.out.println("Entre com o valor pago pelo " + (i+1) +"º CD.");
			valor = input.nextDouble();
			
			soma += valor; 
		};
		
		media = soma / qtdCd;
		System.out.println("Total R$ " + soma);
		System.out.println("Média R$ " + media);
		
	}

}
