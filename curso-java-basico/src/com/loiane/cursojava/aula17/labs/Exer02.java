package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean infoValidas = false;
		String usuario;
		String senha;
		
		//boa pratica declarar variáveis a ser utilizadas dentro de loops
		//pq, caso contrario, se o loop rodar mil vezes, será criado
		//na memoria mil vezes as variaveis.
		do {
			System.out.println("Entre com seu nome de usário: ");
			usuario = input.next();
		
			System.out.println("Entre com sua senha: ");
			senha = input.next();
		
		
			if (usuario.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha deve ser diferente de usuário, insira novamente: ");
			} else {
				infoValidas = true;
				System.out.println("Usuário e senha validos.");
			}
		} while (!infoValidas);
			
		
		
		
	}

}
