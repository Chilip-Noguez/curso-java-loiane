package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 +2;
		/*System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �, ";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		//System.out.println(primeiroNome + segundoNome);
		System.out.println(terceiroNome);*/
		
		resultado = resultado +1;
		System.out.println(resultado); //4
		
		resultado++; //incrementa e mostra resultado
		System.out.println(resultado); //5
		
		System.out.println(resultado++); //mostra resultado 5 depois incrementa que fica 6
		
		//proximos comandos fazem a mesma coisa...
		//System.out.println(resultado);
		//resultado = resultado + 1;
		resultado += 1; //soma mais 1 - fica 7, mas n�o exibe
		
		System.out.println(++resultado); //incrementa depois exibe resutado 8
		//proximos comandos fazem a mesma coisa...
		resultado += 1; //incrementa, mas n�o exibe resultado
		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);

		

	}

}
