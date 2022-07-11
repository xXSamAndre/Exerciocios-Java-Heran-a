package ex1;

public class Professor extends Pessoa{

	private double salario;
	
	public Professor(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	public void Imprime() {
		System.out.println("----DADOS DO PROFESSOR----");
		super.Imprime();
	    System.out.println("Salario: R$"+salario);
	}
	
	
	
}
