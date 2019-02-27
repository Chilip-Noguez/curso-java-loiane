package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade: ");
		int idade = input.nextInt();
		
		if(idade >= 18) {
			
			System.out.println("É maior de idade!");
		} else {
			System.out.println("Não é maior de idade!");
		} */
		
		//barato <= 10 reais
		//10 < valor 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com preço do iten: ");
		double valor = input.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar.");
		}else if (valor > 10 && valor < 15){
			System.out.println("Você pode pedir um desconto.");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais.");
		} else {
			System.out.println("Muito caro.");
		}
	}

}
