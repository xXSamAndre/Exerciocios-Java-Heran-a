package ex4;

public class Novo extends Imovel{

	
	
	public Novo(String nome,double preço) {
		super(nome, preço);
		
	}
	
	public double novoPreço() {
		return getPreco() * 1.5;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa nova em "+this.getEndereco()+", custa R$"+novoPreço());
	}
	
}
