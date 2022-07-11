package ex5;

public class Normal extends Funcionario{

	public Normal(String nome, String cpf, String id, double salario) {
		super(nome, cpf, id, salario);
		
	}

	public double salarioNormal() {
		return this.getSalario() * 1.1;
	}
	
	public void Imprime() {
		System.out.println("Funcionario: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("ID: "+this.getId());
		System.out.println("O salario Normal é:  "+ salarioNormal());
	}
	
	
}
