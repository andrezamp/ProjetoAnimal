
public class Peixe extends Animal {

	private String corEscama;

	public Peixe(double peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo detritos");

	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");

	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
