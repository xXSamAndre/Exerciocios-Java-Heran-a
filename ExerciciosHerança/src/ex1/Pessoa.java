package ex1;

public class Pessoa {

	/* A classe Aluno, Professor e Funcionario serão filha da classe pessoa.
	 * cada uma tera suas proprios atributos e metodos.
	*/
	
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void Imprime() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
	}
	
	
	
	
	
}
