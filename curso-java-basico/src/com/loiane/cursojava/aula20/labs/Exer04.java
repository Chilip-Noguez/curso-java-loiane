package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		
		byte opcao;
		
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso: ");
			System.out.println("Digite 2 para verificar compromisso: ");
			System.out.println("Digite 0 para sair: ");
			
			opcao = input.nextByte();
			
			if(opcao == 1) {//adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente:");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o hora do compromisso: ");
					hora = input.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente:");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] = input.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente:");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o hora do compromisso: ");
					hora = input.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente:");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado �: ");
				System.out.println(compromissos[dia][hora]);
				
				
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println();
			}
		}
		
		
	}

}
