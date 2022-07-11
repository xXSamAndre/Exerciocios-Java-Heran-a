package ex2;

public class CamaroteSuperior extends Vip{

	
	public CamaroteSuperior(double valor) {
		super(valor);
		
	}

	public double CS() {
		return this.getValor() * 1.3;
	}
	
	public void Imprime() {
		System.out.println("Valor do Ingresso do Camarote superior: "+CS());
	}
	
	
	
	
}
