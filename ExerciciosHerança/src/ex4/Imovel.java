package ex4;

public class Imovel {

	private String endereco;
	private double preco;
	
	
	public Imovel(String endereco, double preço) {
		this.endereco = endereco;
		this.preco =preço;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preço) {
		this.preco = preço;
	}
	
	
	
}
