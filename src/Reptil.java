
public class Reptil extends Animal {
	
	private String corEscama;

	public Reptil(double peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;
		
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
