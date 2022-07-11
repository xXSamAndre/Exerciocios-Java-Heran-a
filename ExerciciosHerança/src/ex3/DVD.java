package ex3;

public class DVD extends Produto{

	private int minutos;
	
	public DVD(String nome,int minutos, double preco) {
		super(nome, preco);
		this.minutos = minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}



	public void Imprime() {
		System.out.println("O filme: "+this.getNome()+", tem "+this.getMinutos()+" minutos e custa R$"+this.getPreco());
	}
}
