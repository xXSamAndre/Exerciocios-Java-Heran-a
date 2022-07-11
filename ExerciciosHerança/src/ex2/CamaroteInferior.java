package ex2;

public class CamaroteInferior extends Vip{

	private String Localizacao;
	
	
	
	public CamaroteInferior(double valor, String Localizacao) {
		super(valor);
		this.Localizacao = Localizacao;
	}



	public String getLocalizacao() {
		return Localizacao;
	}



	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}
	
   public double CI() {
	   return getValor() * 1.2;
   }
	
	public void Imprime() {
		System.out.println("Valor do Ingresso do Camarote Inferior:  "+CI());
		System.out.println("Localização:  "+this.getLocalizacao());
	}
	
	
	
	
}
