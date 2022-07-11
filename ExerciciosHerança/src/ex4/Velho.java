package ex4;

public class Velho extends Imovel{

	public Velho(String nome, double preco) {
		super(nome, preco);
		
	}

	public double valorVelho() {
		double velho = this.getPreco() - 500;
		return velho;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa velha em: "+this.getEndereco()+", é de R$"+valorVelho());
	}
}
