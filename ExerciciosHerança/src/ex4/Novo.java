package ex4;

public class Novo extends Imovel{

	
	
	public Novo(String nome,double pre�o) {
		super(nome, pre�o);
		
	}
	
	public double novoPre�o() {
		return getPreco() * 1.5;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa nova em "+this.getEndereco()+", custa R$"+novoPre�o());
	}
	
}
