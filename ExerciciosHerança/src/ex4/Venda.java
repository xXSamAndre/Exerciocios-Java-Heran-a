package ex4;

import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco;
		String endereco;
		int op;
		
		System.out.println("Onde você quer a casa? ");
		endereco = sc.next();
		System.out.println("Quanto você quer pagar? ");
		preco = sc.nextDouble();
		
		System.out.println("--- OPÇÕES DE CASA ---");
		System.out.println("---1- Imoveis Novos");
		System.out.println("---2- Imoveis Velhos");
		op = sc.nextInt();
				
		if(op == 1) {
			Novo n = new Novo(endereco, preco);
			n.Imprime();
		} else if (op == 2) {
			Velho v = new Velho(endereco, preco);
			v.Imprime();
			
		}
		

	}

}
