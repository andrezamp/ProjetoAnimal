
public class Programa {
	public static void main(String[] args) {
		Peixe dourado = new Peixe(0.5, 1, 4, "azul");
		dourado.soltarBolha();

		Ave psiforme = new Ave(2.5, 2, 2, "amarelo");
		psiforme.emitirSom();

		Mamifero canideo = new Mamifero(12, 6, 4, "preto");
		canideo.alimentar();

		Cachorro pacoca = new Cachorro(20, 2, 4, "castanho e branco");
		pacoca.enterrarOsso();

		Tartaruga jabuti = new Tartaruga(50, 58, 4, "verde");
		jabuti.locomover();

		Canguru guru = new Canguru(12, 10, 4, "castanho");
		guru.usarBolsa();

	}
}
