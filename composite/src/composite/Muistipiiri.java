package composite;

public class Muistipiiri implements Laiteosa{

	int hinta = 5;
	
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Osan lisääminen ei onnistunut");
	}

	public int annaHinta() {
		System.out.println("Muistipiirin hinta: " + hinta);
		return hinta;
	}

}
