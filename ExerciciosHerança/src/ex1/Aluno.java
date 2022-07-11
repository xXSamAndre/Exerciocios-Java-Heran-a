package ex1;

public class Aluno extends Pessoa{

	private String ra;
	
	public Aluno(String nome, String cpf, String ra) {
		super(nome, cpf);
		this.ra = ra;
	}
	
	public void Imprime() {
		System.out.println("-----DADOS DO ALUNO----");
		super.Imprime();
		System.out.println("RA: "+ra);
	}
	
}
