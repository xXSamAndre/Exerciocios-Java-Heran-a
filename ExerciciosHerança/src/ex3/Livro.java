package ex3;

public class Livro extends Produto{

	private String autor;
	
	public Livro(String nome, String autor,double preco) {
		super(nome, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


	public void Imprime() {
		System.out.println("O livro, "+this.getNome()+" escrito por:  "+this.getAutor()+", custa R$"+this.getPreco());
	}
	
}
