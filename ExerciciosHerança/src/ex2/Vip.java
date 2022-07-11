package ex2;

public class Vip extends Ingresso{

	private double vip;
	
	public Vip(double valor) {
		super(valor);
		
	}

	public double IngressoVip(){
		vip = this.getValor() * 1.1;
		return vip;
	}
	
	public void Imprime() {
		System.out.print("Valor do ingresso Vip:  "+IngressoVip());
		
	}
	
}
