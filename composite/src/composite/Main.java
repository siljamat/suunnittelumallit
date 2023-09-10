package composite;

public class Main {
	
	public static void main(String[] args) {
	
		Laiteosa emolevy = new Emolevy();
		Laiteosa kotelo = new Kotelo();
		
		Laiteosa muistipiiri = new Muistipiiri();
		Laiteosa naytonohjain = new Naytonohjain();
		Laiteosa prosessori = new Prosessori();
		Laiteosa verkkokortti = new Verkkokortti();
		
		((Emolevy) emolevy).lisaaOsa(muistipiiri);
		((Emolevy) emolevy).lisaaOsa(naytonohjain);
		((Emolevy) emolevy).lisaaOsa(prosessori);
		((Emolevy) emolevy).lisaaOsa(verkkokortti);
		
		((Kotelo) kotelo).lisaaOsa(emolevy);
		
		System.out.println("Emolevy sisältöineen: " + emolevy.annaHinta() + "€");
		System.out.println("Kotelo sisältöineen: " + kotelo.annaHinta() + "€");

	}
}
