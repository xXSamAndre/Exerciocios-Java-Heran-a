package ex1;

public class Funcionario extends Pessoa{

	private double salario;
	private String id;
	
	public Funcionario(String nome, String cpf, double salario, String id) {
		super(nome, cpf);
		this.salario = salario;
		this.id = id;
	}

	public void Imprime() {
		System.out.println("----DADOS DO FUNCIONARIO----");
		super.Imprime();
		System.out.println("Salario: R$"+salario);
		System.out.println("ID: "+id);
	}
	
	
}
