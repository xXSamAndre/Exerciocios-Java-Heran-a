package ex3;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner (System.in);
		
		String nome, autor;
		int minutos, faixas, op;
		double preco;
		
		System.out.println("--- PRODUTOS DA LOJA ---");
		System.out.println("---1- LIVROS");
		System.out.println("---2- CDs");
		System.out.println("---3- DVDs");
		System.out.println("---4- SAIR");
        op = sc.nextInt();
        
        if(op == 1) {
        	System.out.print("Nome do livro:  ");
        	nome = sc.next();
        	System.out.print("Autor do livro:");
        	autor = sc.next();
        	System.out.print("Preço do livro: ");
        	preco = sc.nextDouble();
        	
        	Livro l = new Livro(nome, autor, preco);
        	l.Imprime();
        } else if (op == 2) {
        	System.out.print("Nome do CD: ");
        	nome = sc.next();
        	System.out.print("Quantidade de faixas do CD:  ");
        	faixas = sc.nextInt();
        	System.out.print("Preço do CD:  ");
        	preco = sc.nextDouble();
        	
        	CD c = new CD(nome, faixas, preco);
            c.Imprime();
        	} else if (op == 3) {
        		System.out.print("Nome do filme:  ");
        		nome = sc.next();
        		System.out.print("Tempo de duração em minutos:  ");
        		minutos = sc.nextInt();
        		System.out.print("Preço do filme:  ");
        		preco = sc.nextDouble();
        		
        		DVD d = new DVD(nome, minutos, preco);
        		d.Imprime();
        	}
        
        
        
        
	}

}
