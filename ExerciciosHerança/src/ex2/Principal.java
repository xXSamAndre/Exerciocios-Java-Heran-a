package ex2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double valor;
		String Localizacao;
		int op;
		
		System.out.println("Qual o valor padrão do ingresso?:  ");
		valor = sc.nextDouble();
		
		
		System.out.println("--- Qual a opção desejada? ---");
		System.out.println("--- 1 - Normal");
		System.out.println("--- 2 - Vip");
		System.out.println("--- 3 - Camarote Inferior");
		System.out.println("--- 4 - Camarote Superior");
		System.out.println("--- 5 - Sair");
		op = sc.nextInt();
		
		if (op == 1) {
			Normal no = new Normal(valor);
			no.Imprime();
		} else if (op == 2) {
			Vip vp = new Vip(valor);
			vp.Imprime();
		} else if (op == 3) {
			System.out.println("Qual a localozação do seu ingresso:  ");
			Localizacao = sc.next();
			CamaroteInferior ci = new CamaroteInferior(valor, Localizacao);
		} else if (op == 4) {
			CamaroteSuperior cs = new CamaroteSuperior(valor);
			cs.Imprime();
		} else if (op == 5 ) {
			System.out.println("Opcao invalida");
		}
	}

}
