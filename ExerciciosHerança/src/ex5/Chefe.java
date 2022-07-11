package ex5;

public class Chefe extends Normal{

	public Chefe(String nome, String cpf, String id, double salario) {
		super(nome, cpf, id, salario);
	
	}

	public double salarioChefe() {
		return this.salarioNormal() * 1.2;
	}
	
	public void Imprime() {
		System.out.println("Funcionario: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("ID: "+this.getId());
		System.out.println("Salario do chefe:  "+salarioChefe());
	}
	
	
}
