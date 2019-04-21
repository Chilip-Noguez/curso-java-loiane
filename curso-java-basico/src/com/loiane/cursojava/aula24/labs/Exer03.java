package com.loiane.cursojava.aula24.labs;

public class Exer03 {
	
	public static void main (String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro:=" + livro.nome);
		System.out.println("Autor = " + livro.autor);
		System.out.println("Valor = " + livro.preco);
		
		
	}

}
//aula correão 24 - timer 15:42