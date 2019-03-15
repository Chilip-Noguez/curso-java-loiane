package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Lojas tabajara.");
		
		boolean sair = false;
		String continuarCompra, output;
		int qtdProdutos;
		double preco, total;
		double valorPago, troco;
		
		
		do {
			System.out.println(" Deseja informar uma nova compra?");
			continuarCompra = input.next();
			
			output = "Lojas Tabajara\n";
			
			if (continuarCompra.equalsIgnoreCase("s")) {
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = input.nextInt();
				
				total = 0;
				
				for (int i=1; i<=qtdProdutos; i++) {
					System.out.println("Informe preço do produto " + i);
					preco = input.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				output += "Total: R$ " +total;
				
				System.out.println("Total R$: " + total);
				
				System.out.println("Entre com o valor pago");
				valorPago = input.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = total - valorPago;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
			} else {
				sair = true;
			}
			
			System.out.println("Digite a quantidade de produtos da compra:");
			
			
		} while(!sair);
		
		
	}

}
