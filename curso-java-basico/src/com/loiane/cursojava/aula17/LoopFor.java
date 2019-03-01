package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i=0; i<5; i++) {
			System.out.println("i tem o valor: " + i);
		}
		
		for (int i=5; i>=0; i--) {
			System.out.println("i tem o valor: " + i);
		}
		
		for(int i=0, j=10; i<j; i++, j-- ) {
			System.out.println("i = " + i + "; j = " +j);
		}
		
		//for "com partes ausentes"
		int count = 0;
		for( ; count <10;) {
			System.out.println("Valor de count: " + count);
			count +=2;
		}
		
		//proximo código é mesmo que o de cima
		//mas caso acha nececidade de a variável estar
		//declarada fora do for, temos o exemplo acima
		for(int cont=0; cont < 10; cont +=2) {
			System.out.println("Valor de count: " + cont);
		}
		
		//loop infinito
		//for ( ; ; ) {
			
		//}
		
		
		//loop sem corpo
		int soma =0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é: " + soma);
		
		/*
		//não é boa pratica
		for (int i=0; i<5; i++)
			System.out.println("i tem o valor: " + i);
		*/
		
	}

}
